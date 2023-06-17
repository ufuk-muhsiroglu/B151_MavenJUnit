package techproed.day14_Actions_Faker;

import com.github.javafaker.Faker;
import org.junit.Test;
public class C04_Faker {

    @Test
    public void faker() {
          /*
           Faker class indan sahte verileri kullanabilmek icin object olusturmamiz gerekir
            */
        Faker faker = new Faker();

        // faker objesini kullanarak bir isim yazdiralim
        System.out.println("isim : " +faker.name().firstName());

        // faker objesini kullanarak bir lastname yazdiralim
        System.out.println("soyisim : "+faker.name().lastName());

        // faker objesini kullanarak bir fullname yazdiralim
        System.out.println("Fullname : "+faker.name().fullName());

        // faker objesini kullanarak bir address yazdiralim
        System.out.println("Adres : "+faker.address().fullAddress());
        // faker objesini kullanarak bir tel_no yazdiralim
        System.out.println("Cep no : "+faker.phoneNumber().cellPhone());
        System.out.println("Tel no : "+faker.phoneNumber().phoneNumber());

        System.out.println("ID NO :" +faker.idNumber().valid());
        System.out.println("15 haneli no : "+faker.number().digits(15));
        System.out.println("meslek: "+faker.job().position());


    }
}
