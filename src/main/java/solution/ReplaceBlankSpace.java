package solution;

public class ReplaceBlankSpace {

    /**
     *
     * 举一反三：
     *     假设有两个排序数组 A1 A2，且A1末尾有足够大的空间容纳A2，现在
     *     合并两个数组，要求和并后有序。
     *     思路：从后往前比较A1 A2 并且写入A1中，覆盖之前的值。用三个指针即可，
     *     分别指向：A1末尾 A2末尾和 要写入A1的位置。
     *
     * @param s
     * @return
     */


    public String solution(String s) {

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (i + 1 < s.length()) {
                    s = s.substring(0, i) + "%20" + s.substring(i + 1);
                } else {
                    s = s.substring(0, i) + "%20";
                }
            }
        }
        return s;
    }
    public String solution(StringBuffer s){
        StringBuffer str = new StringBuffer();
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {

                str.append(s.substring(temp,i) + "%20");
                temp = i+1;
            }
        }
        str.append(s.substring(temp));
        return str.toString();
    }


}
