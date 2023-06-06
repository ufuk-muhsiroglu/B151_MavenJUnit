package techproed.day08_Assertion;
import org.junit.*;
public class C01_BeforeClassAfterClass {
    /*
    @BeforeClass ve @AfterClass methodları static olmak zorundadir
     */
    @BeforeClass
    public static void beforeClass() throws Exception {
        System.out.println("Her class'dan önce BeforeClass Method'u bir kez çalışır");
    }
    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("Her class'dan sonra AfterClass Method'u bir kez çalışır");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("Her method'dan önce Before(setUp) method'u bir kez çalışır");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("Her method'dan sonra After(tearDown) method'u bir kez çalışır");
    }
    @Test
    public void test01() {
        System.out.println("Test01 methodu çalıştı");
    }
    @Test
    public void test02() {
        System.out.println("Test02 methodu çalıştı");
    }
    @Test
    public void test03() {
        System.out.println("Test03 methodu çalıştı");
    }
}


//    *** Aşağıdaki Task'i Junit framework'u ile yapınız
//- Before methodu ile drive'i olusturup ayarlamalari yapiniz
//            - ebay sayfasına gidiniz
//- electronics bölümüne tıklayınız
//- Genişliği 225 ve Uzunluğu 225 olan resimlerin hepsine tıklayalım
//- Her sayfanın sayfa başlığını yazdıralım
//- After methodu ile sayfayı kapatalım

