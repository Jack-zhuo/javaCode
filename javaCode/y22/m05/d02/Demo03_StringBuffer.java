package y22.m05.d02;

public class Demo03_StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java is very interesting. I very like to study it.");
        sb.append("No,I am so sorry, I lied to you. I don't like java, I learn it in order to make money.");
        System.out.println(sb);
    }
}
