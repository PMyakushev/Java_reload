package Unit_4.Practice;

import java.util.Deque;
import java.util.LinkedList;

public class Ex3 {
    public static void main(String[] args) {
        System.out.println("simplefyPath(\"/home/\"):" + simplefyPath("/home/dd/../s"));
        System.out.println("simplefyPath(\"/../\"):" + simplefyPath("/../"));
        System.out.println("simplefyPath(\"/home//foo/\"):" + simplefyPath("/home//foo/"));
    }

    public static String simplefyPath(String path) {
        Deque<String> deq = new LinkedList<>();
        String[] subPath = path.split("/");
        for (String s : subPath) {
            if ("..".equals(s)) {
                if (!deq.isEmpty()) {
                    deq.pollLast();
                }
            } else if (!".".equals(s) && !"".equals(s)) { // ! Если не точка или пустая строка
                deq.add(s);
            }
        }
        if (deq.isEmpty()) {
            return "/";
        }
        StringBuilder res = new StringBuilder();
        while (!deq.isEmpty()) {
            res.append("/").append(deq.pop());
        }
        return res.toString();
    }
}
