import java.util.HashMap;

public class Dictionary {
    public static HashMap<Integer, Character> idxToChar = new HashMap<>() {{
        put(0, 'A');
        put(1, 'B');
        put(2, 'C');
        put(3, 'D');
        put(4, 'E');
        put(5, 'F');
        put(6, 'G');
        put(7, 'H');
        put(8, 'I');
        put(9, 'J');
        put(10, 'K');
        put(11, 'L');
        put(12, 'M');
        put(13, 'N');
        put(14, 'O');
        put(15, 'P');
        put(16, 'Q');
        put(17, 'R');
        put(18, 'S');
        put(19, 'T');
        put(20, 'U');
        put(21, 'V');
        put(22, 'W');
        put(23, 'X');
        put(24, 'Y');
        put(25, 'Z');
        put(26, '0');
        put(27, '1');
        put(28, '2');
        put(29, '3');
        put(30, '4');
        put(31, '5');
        put(32, '6');
        put(33, '7');
        put(34, '8');
        put(35, '9');
        put(36, '(');
        put(37, ')');
        put(38, '*');
        put(39, '+');
        put(40, ',');
        put(41, '-');
        put(42, '.');
        put(43, '/');
    }};

    public static HashMap<Character, Integer> charToIdx = new HashMap<>() {{
        put('A', 0);
        put('B', 1);
        put('C', 2);
        put('D', 3);
        put('E', 4);
        put('F', 5);
        put('G', 6);
        put('H', 7);
        put('I', 8);
        put('J', 9);
        put('K', 10);
        put('L', 11);
        put('M', 12);
        put('N', 13);
        put('O', 14);
        put('P', 15);
        put('Q', 16);
        put('R', 17);
        put('S', 18);
        put('T', 19);
        put('U', 20);
        put('V', 21);
        put('W', 22);
        put('X', 23);
        put('Y', 24);
        put('Z', 25);
        put('0', 26);
        put('1', 27);
        put('2', 28);
        put('3', 29);
        put('4', 30);
        put('5', 31);
        put('6', 32);
        put('7', 33);
        put('8', 34);
        put('9', 35);
        put('(', 36);
        put(')', 37);
        put('*', 38);
        put('+', 39);
        put(',', 40);
        put('-', 41);
        put('.', 42);
        put('/', 43);
    }};
}