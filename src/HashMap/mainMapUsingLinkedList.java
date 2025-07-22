package HashMap;

public class mainMapUsingLinkedList {
    public static void main(String[] args) {
        mapUsingLinkedList<String,String> map=new mapUsingLinkedList<>();
        map.put("sandy","my name");
        map.put("shal","my sis");
        map.put("shantha","my mom");
        map.put("saravanan","my dad");

        System.out.println(map.get("sandy"));
        System.out.println(map);
    }
}
