import java.time.*;
public class Java8_9 {
    public static void main(String[]args){
        LocalDate today=LocalDate.now();
        LocalDate birth=LocalDate.of(2000,05,12);
        Period p=Period.between(birth,today);
        System.out.printf("%d year %d months %d day",p.getYears(),p.getMonths(),p.getDays()

        );
    }
}
