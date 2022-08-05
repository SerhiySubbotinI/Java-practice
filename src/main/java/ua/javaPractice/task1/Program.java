package ua.javaPractice.task1;

public class Program {
    public static void main(String[] args) {
        //firstDayOfWeek: 0=Sunday, 1=Monday, 2=Tuesday, 3=Wednesday, 4=Thrusday, 5=Friday, 6=Saturday
        System.out.printf("If the first day of the week is Monday: %d \n", getSundayCount(1));
        System.out.printf("If the first day of the week is Sunday: %d \n", getSundayCount(0));
    }
    private static int getSundayCount(int firstDyaOfWeek) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sundayCounter = 0;
        for (int year = 1900; year <= 2000; year++) {
            if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0)
                months[1] = 29;
            else
                months[1] = 28;
            for (int month : months) {
                firstDyaOfWeek = (firstDyaOfWeek + month) % 7;
                if (firstDyaOfWeek == 0 && year > 1900)
                    sundayCounter++;
            }
        }
        return sundayCounter;
    }
}
