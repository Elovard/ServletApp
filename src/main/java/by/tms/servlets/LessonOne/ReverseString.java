package by.tms.servlets.LessonOne;

public class ReverseString {
    public String reverse (String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
