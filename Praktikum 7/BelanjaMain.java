import java.util.Date;
import java.text.SimpleDateFormat;

public class BelanjaMain {
        public static void main(String[] args) {
            Date waktu = new Date();
            
            SimpleDateFormat sdf = new SimpleDateFormat("EEEE,dd MMMM YYYY");
            
            belanja struk = new belanja(8);
            belanja[] belanjaDewi = new belanja[8];
            String date = sdf.format(waktu);
            
            belanjaDewi[0] = new belanja("aaaa-010-221", 12, 1200000, date);
            belanjaDewi[1] = new belanja("aaaa-020-221", 2, 1100000, date);
            belanjaDewi[2] = new belanja("aaaa-013-242", 21, 1500000, date);
            belanjaDewi[3] = new belanja("aaaa-524-242", 3, 160000, date);
            belanjaDewi[4] = new belanja("aaaa-310-551", 5, 1298000, date);
            belanjaDewi[5] = new belanja("aaaa-940-645", 10, 200000, date);
            belanjaDewi[6] = new belanja("aaaa-784-215", 9, 3200000, date);
            belanjaDewi[7] = new belanja("aaaa-425-254", 8, 1800000, date);
            
            for (int i = 0; i < struk.size; i++) {
                struk.push(belanjaDewi[i]);
            }
            struk.print();
            struk.line(50);
            System.out.println("\tData yang di-pop |struk 5 minggu|");
            struk.line(50);
            for (int i = 0; i < 5; i++) {
                struk.pop();
            }
            struk.print();
        }
    }

