
class LeapYear {

    public static void main(String[] args) {
        testLeapYear(2000, true);
        testLeapYear(2004, true);
        testLeapYear(1900, false);
        testLeapYear(2001, false);
        testLeapYear(2002, false);
        testLeapYear(2003, false);
        testLeapYear(2005, false);
        testLeapYear(2006, false);
        testLeapYear(2007, false);
        testLeapYear(2008, true);
        testLeapYear(2009, false);
        testLeapYear(2010, false);
        testLeapYear(2011, false);
        testLeapYear(2012, true);
        testLeapYear(2013, false);
        testLeapYear(2014, false);
        testLeapYear(2015, false);
        testLeapYear(2016, true);
        testLeapYear(2017, false);
        testLeapYear(2018, false);
        testLeapYear(2019, false);
        testLeapYear(2020, true);
        testLeapYear(2021, false);
        testLeapYear(2022, false);
        testLeapYear(2023, false);
        testLeapYear(2024, true);
        testLeapYear(2025, false);
        testLeapYear(2026, false);
        testLeapYear(2027, false);
        testLeapYear(2028, true);
        testLeapYear(2029, false);
        testLeapYear(2030, false);
        testLeapYear(2031, false);
        testLeapYear(2032, true);
        testLeapYear(2033, false);
        testLeapYear(2034, false);
        testLeapYear(2035, false);
        testLeapYear(2036, true);
        testLeapYear(2037, false);
        testLeapYear(2038, false);
        testLeapYear(2039, false);
        testLeapYear(2040, true);
        testLeapYear(2041, false);
        testLeapYear(2042, false);
        testLeapYear(2043, false);
        testLeapYear(2044, true);
        testLeapYear(2045, false);
        testLeapYear(2046, false);
        testLeapYear(2047, false);
        testLeapYear(2048, true);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            } else
                return true;
        } else {
            return false;
        }
    }

    public static void testLeapYear(int year, boolean expected) {
        boolean result = isLeapYear(year);
        System.out.println("Year: " + year + " - Expected: " + expected + " - Result: " + result);
    }
}