//Geeks for Geeks article: https://www.geeksforgeeks.org/rank-elements-array/

public static double[] rankify(int[] arr) {

        Map<Integer, List<Integer>> myMap = new HashMap<Integer, List<Integer>>();               //value -> corresponding indices List where they appear in array

        for (int i = 0; i < arr.length; i++) {
            if (myMap.containsKey(arr[i])) {
                //fetch arraylist
                List<Integer> temp = myMap.get(arr[i]);
                temp.add(i);
                myMap.put(arr[i], temp);
            } else {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(i);
                myMap.put(arr[i], temp);
            }
        }

        Arrays.sort(arr);
        int rank = 1;
        int sum = 0;
        int count;
        double[] ans = new double[arr.length];
        for (int j = 0; j < arr.length; j++) {
            sum = rank;
            count = 1;
            while (j + 1 < arr.length && arr[j] == arr[j + 1]) {
                sum += ++rank;

                count++;
                j++;
            }
            //find this key(arr[j] in map
            List<Integer> temp = myMap.get(arr[j]);
            //set the ans array with sum/count
            for (int i = 0; i < temp.size(); i++) {
                ans[temp.get(i)] = (double)sum / count;
            }
            ++rank;
        }

        return ans;

    }
