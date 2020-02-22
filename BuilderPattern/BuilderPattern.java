package BuilderPattern;

class BuilderPattern {
    public static void main(String args[]) {
        Computer computer = new Computer.Builder().setCompName("HP").setProcessor("SnapDragon").setOs("Android")
                .setVersion(9).build();
        System.out.println(computer);

    }
}