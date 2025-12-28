//LINK: https://leetcode.com/problems/defanging-an-ip-address/submissions/1867802592/?envType=problem-list-v2&envId=string

public class DefanginganIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder str=new StringBuilder();

        for(int i=0;i<address.length();i++){
            if(address.charAt(i)=='.'){
                str.append("[.]");
            }
            else{
                str.append(address.charAt(i));
            }
        }

        return str.toString();

    }

    public static void main(String[] args) {
        DefanginganIPAddress solution = new DefanginganIPAddress();
        String address = "192.168.1.1";
        String result = solution.defangIPaddr(address);
        System.out.print(result + " ");
    }
}