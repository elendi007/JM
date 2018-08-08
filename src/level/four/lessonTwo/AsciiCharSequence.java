package level.four.lessonTwo;

public class AsciiCharSequence implements CharSequence {

    private byte [] byte_array;

    AsciiCharSequence(byte[] bytes_array){
        this.byte_array = bytes_array;
    }

    @Override
    public int length() {
        return this.byte_array.length;
    }

    /**
     * @param index
     * @return символ, расположенный по указанному индексу строки. Индексы строк в Java начинаются с нуля.
     */
    @Override
    public char charAt(int index) {
        return (char) byte_array[index];
    }

    /**
     * @param start
     * @param end
     * @return новую последовательность символов,
     * которая является подпоследовательностью этой последовательности,
     * другими словами — возвращает последовательность символов из строки, начиная и заканчивая указанными индексами.
     */
    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] assignedSequence = new byte[end - start];
        System.arraycopy(byte_array, start, assignedSequence, 0, end - start);
        return new AsciiCharSequence(assignedSequence);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < byte_array.length; i++) {
            stringBuilder.append((char) byte_array[i]);
        }
        return stringBuilder.toString();
    }
}
