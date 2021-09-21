public class Mortgage {

        private Mortgage () {
        }

        public static int calculateMortgage ( int age, int salary, Gender gender ) {
                double factor = 0;

                if (gender == Gender.FEMALE) {
                        if (18 <= age & age <= 35) {
                                factor = 7;
                        } else if (36 <= age & age < 45) {
                                factor = 5;
                        } else if (46 <= age & age <= 55) {
                                factor = 3;
                        }
                }
                if (gender == Gender.MALE) {
                        if (18 <= age & age <= 35) {
                                factor = 7.5;
                        } else if (36 <= age & age <= 45) {
                                factor = 5.5;
                        } else if (46 <= age & age <= 55) {
                                factor = 3.5;
                        }
                }

                return (int)(salary * factor);
        }
}