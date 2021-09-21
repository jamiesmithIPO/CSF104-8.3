import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

public class MortgageTest {

        @Test
        public void test1 () {
                Assert.assertEquals ( 140000, Mortgage.calculateMortgage ( 25,
                        20000, Gender.FEMALE
                                                                         ) );
        }

        @Test
        public void test2 () {
                Assert.assertEquals ( 100000, Mortgage.calculateMortgage ( 40,
                        20000, Gender.FEMALE
                                                                         ) );
        }

        @Test
        public void test3 () {
                Assert.assertEquals ( 60000, Mortgage.calculateMortgage ( 50,
                        20000, Gender.FEMALE
                                                                        ) );
        }

        @Test
        public void test4 () {
                Assert.assertEquals ( 150000, Mortgage.calculateMortgage ( 25,
                        20000, Gender.MALE
                                                                         ) );
        }

        @Test
        public void test5 () {
                Assert.assertEquals ( 110000, Mortgage.calculateMortgage ( 40,
                        20000, Gender.MALE
                                                                         ) );
        }

//        @Test
//        public void test6 () {
//                Assert.assertEquals ( 70000, Mortgage.calculateMortgage ( 50,
//                        20000, Gender.MALE
//                                                                        ) );
//        }

        @Test
        public void testPrivateConstructor () throws Exception {
                Constructor
                        constructor = Mortgage.class.getDeclaredConstructor ( );
                Assert.assertTrue ( "Constructor is not private", Modifier
                        .isPrivate ( constructor.getModifiers ( ) ) );

                constructor.setAccessible ( true );
                constructor.newInstance ( );
        }
        @Test
        public void main(){
                Main.main ( new String[]{} );
        }
}