
import java.text.DecimalFormat;

public class Player {
        private String name;
        private double avarage;

        public Player(String name, double avarage) {
            this.name = name;
            this.avarage = avarage;
        }

        public String getName(){
            return name;
        }

        public String getAvarageString(){
            DecimalFormat decFormat = new DecimalFormat();
            decFormat.setMaximumIntegerDigits(0);
            decFormat.setMaximumFractionDigits(3);
            decFormat.setMinimumFractionDigits(3);
            return decFormat.format(avarage);
        }
    }


