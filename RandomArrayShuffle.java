//Good way to generate a random shuffling of an array
//every permutation has a equal probablity here

 public int[] shuffle() {
        int index, temp;
        Random random = new Random();
        for (int i = orig.length - 1; i > 0; i--)
        {
        index = random.nextInt(i + 1);
        temp = orig[index];
        orig[index] = orig[i];
        orig[i] = temp;
        }
        return orig;
    }
