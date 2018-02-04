 public int findRadius(int[] houses, int[] heaters) {
         
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int i = 0, res = 0;
        for(int house: houses){
            while(i + 1 < heaters.length && Math.abs(heaters[i] - house) >= Math.abs(heaters[i + 1] - house)){
                i++;
            }
            res = Math.max(res, Math.abs(heaters[i] - house));
        }
        return res;
    }
    
    
    /*The difficulty of this problem is to understand Math.abs(heaters[i] - house) >= Math.abs(heaters[i + 1] - house
Let’s us understand this with a example:
houses: 1, 2, 3, 4
heaters: 1, 4
For house 1, heater 1 is closer to it than heater 4, so we don’t move i to i + 1.
For house 2, it is same. heater 1 is closer.
For house 3, it is clear that heater 1 no longer closer, so we move i to i + 1.
For house 4, continue…
The idea here is we move the heater to rightward in case it is closer to the given house.*/
