class RemoveSpaces {
    public static void main(String[] j) {
        String str1 = "Java ";
        str1 = str1.replace(" ", "");
        System.out.println(str1);
        String str2 = "Java\tis\nfun";
        str2 = str2.replaceAll("\\s", "");
        System.out.println(str2);
        String str3 = "Hello world";
        str3 = str3.strip();
        System.out.println(str3);
    }
}
