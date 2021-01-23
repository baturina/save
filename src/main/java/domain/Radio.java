package domain;

     public class Radio {
         private int minStation = 0;
         private int maxStation = 20;
         private int currentStation;
         private int minVolume = 0;
         private int maxVolume = 100;
         private int currentVolume;


         public int getMaxStation() {
             return maxStation;
         }

         public Radio(int maxStation, int currentStation, int currentVolume) {
             this.maxStation = maxStation;
             this.currentStation = currentStation;
             this.currentVolume = currentVolume;
         }
         public Radio () {

         }



         public int getCurrentStation() {

             return currentStation;
         }

         public void setCurrentStation(int currentStation) {

             if (currentStation > maxStation) {

                 this.currentStation = minStation;
                 return;
             }
             if (currentStation < minStation) {
                 this.currentStation = maxStation;


                 return;
             }

             this.currentStation = currentStation;

         }


         public int getCurrentVolume() {
             return currentVolume;
         }


         public void setNexCurrentStation() {
             if (currentStation == maxStation) {
                 this.currentStation = minStation;
                 return;
             }
             currentStation++;
         }

         public void setPrevCurrentStation() {
             if (currentStation == minStation) {
                 this.currentStation = maxStation;
                 return;
             }
             currentStation--;
         }


         public void setCurrentVolume(int currentVolume) {
             if (currentVolume >= maxVolume) {
                 this.currentVolume = maxVolume;
                 return;
             }

             if (currentVolume <= minVolume) {
                 this.currentVolume = minVolume;
                 return;

             }

             this.currentVolume = currentVolume;
         }


         public void setIncreaseCurrentVolume() {
             if (currentVolume >= maxVolume) {
                 return;
             }
             currentVolume++;
         }


         public void setDecreaseCurrentVolume() {
             if (currentVolume <= minVolume) {
                 return;
             }
             currentVolume--;
         }
     }