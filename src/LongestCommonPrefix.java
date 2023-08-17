public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{"ab","a"}));
    }
    private static  String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return null;
        }
        String common = strs[0];
        int nr;
        while (!common.isEmpty()){
            nr = 0;
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length()<common.length()){
                    common = common.substring(0, common.length()-1);
                    break;
                }
                if (!common.equals(strs[i].substring(0, common.length()))){
                    try{
                        common = common.substring(0, common.length()-1);
                        break;
                    } catch (StringIndexOutOfBoundsException e){
                        return "";
                    }
                }
                nr++;
            }
            if (nr == strs.length-1){
                return common;
            }
        }
        return common;
    }
}
