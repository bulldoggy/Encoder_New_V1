public class EncoderV1 {
    private char offsetChar;

    public EncoderV1() {}

    public EncoderV1(char offsetChar) {
        offsetChar = Character.toUpperCase(offsetChar);

        if(!Dictionary.charToIdx.containsKey(offsetChar)) {
            throw new IllegalArgumentException("Invalid offset character provided");
        } else {
            this.offsetChar = offsetChar;
        }
    }

    public void setOffsetChar(char offsetChar) {
        offsetChar = Character.toUpperCase(offsetChar);

        if(!Dictionary.charToIdx.containsKey(offsetChar)) {
            throw new IllegalArgumentException("Invalid offset character provided");
        } else {
            this.offsetChar = offsetChar;
        }
    }

    public char getOffsetChar() {
        return this.offsetChar;
    }

    public String encode(String plainText) {
        if(offsetChar == '\u0000') { //if char is null
            throw new RuntimeException("Offset character is required to be set before encoding");
        }

        plainText = plainText.toUpperCase();
        StringBuilder sb = new StringBuilder();
        int shift = Dictionary.charToIdx.get(offsetChar);

        sb.append(Dictionary.idxToChar.get(shift));
        for(char c : plainText.toCharArray()) {
            if(' ' == c) {
                sb.append(' ');
            } else {
                int newPos = Dictionary.charToIdx.get(c) - shift;

                if(newPos < 0) {
                    newPos = 44 + newPos;
                }

                sb.append(Dictionary.idxToChar.get(newPos));
            }
        }

        return sb.toString();
    }

    public String decode(String encodedText) {
        encodedText = encodedText.toUpperCase();
        StringBuilder sb = new StringBuilder();
        boolean isOffset = true;
        int shift = 0;

        for(char c : encodedText.toCharArray()) {
            if(isOffset) {
                shift = Dictionary.charToIdx.get(encodedText.charAt(0));
                isOffset = false;
            } else if(' ' == c) {
                sb.append(' ');
            } else {
                int newPos = Dictionary.charToIdx.get(c) + shift;

                sb.append(Dictionary.idxToChar.get(newPos % 44));
            }
        }

        return sb.toString();
    }
}
