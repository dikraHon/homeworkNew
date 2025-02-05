public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    SEPTEMBER,
    NOVEMBER,
    DECEMBER;

    public void isWinter(String value) {
        if (value.equals(JANUARY.toString())) {
            System.out.println("is Winter");
        } else if (value.equals(FEBRUARY.toString())) {
            System.out.println("is winter");
        } else if (value.equals(DECEMBER.toString())) {
            System.out.println("is winter");
        } else {
            System.out.println("is not winter");
        }
    }
}
