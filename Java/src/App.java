public class App {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        X3Map map = new X3Map<String, Integer, String>();
        map.set("allo", 1, "map");
        map.set("args", 2);
        map.set("all", 3, "a");
        System.out.println(map.get("allo").getKey() + " " + map.get(1).getValue() + " " + map.get("all"));
    }
}
