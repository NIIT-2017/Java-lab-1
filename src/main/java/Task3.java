public class Task3 {

    public static void main(String[] args) {
        Task3 Str = new Task3 ();

        String buf = Str.deploymnet("1,2,3,4-18,20,21,22,23-24,25-29,30");
        System.out.println(buf);
    }

    String deploymnet(String entStr) {

        String NewStr = "";
        int endS = entStr.length();
        int check = 0;

        for (; check < endS; check++) {

            if (entStr.charAt(check) != '-') {
                NewStr += entStr.charAt(check);
            }

            else if (entStr.charAt(check) == '-') {
                int checkIn = 0;
                String Start = "";
                String End = "";

                if (entStr.charAt(check -2) != ',') {
                    Start += entStr.charAt(check - 2);
                }
                Start += entStr.charAt(check - 1);

                End += entStr.charAt(check +1);

                if (entStr.charAt(check +2) != ',') {
                    End += entStr.charAt(check + 2);
                }

                int StartRange = Integer.parseInt (Start);
                int EndRange = Integer.parseInt (End);
                int Range = ((EndRange - StartRange)-1);

                for (; checkIn < Range; checkIn++) {
                    StartRange++;
                    NewStr += ",";
                    NewStr += (StartRange);
                }
                NewStr += ",";

                StartRange = 0;
                EndRange = 0;

            }
        }
        return NewStr;
    }
}