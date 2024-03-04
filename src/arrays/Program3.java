package arrays;


import java.util.HashMap;

class Mario {

    private String villain;

    private String life;

    public Mario(String life, String villain) {

        this.life = life;

        this.villain = villain;

    }

    // Getters and setters

    public String getLife() {

        return life;

    }

    public void setLife(String life) {

        this.life = life;

    }

    public String getVillain() {

        return villain;

    }

    public void setVillain(String villain) {

        this.villain = villain;

    }

}

class PlayMario {

    private Mario mario;

    public PlayMario(Mario mario) {

        this.mario = mario;

    }

    // Method to return the number of lives Mario can still avail

    public String lifeCheck() {

        String[] lives = mario.getLife().split(" ");

        int count = 0;

        HashMap<String, String> numbersMap = new HashMap<>();

        numbersMap.put("0", "Zero");

        numbersMap.put("1", "One");

        numbersMap.put("2", "Two");

        numbersMap.put("3", "Three");

        numbersMap.put("4", "Four");

        numbersMap.put("5", "Five");

        numbersMap.put("6", "Six");

        numbersMap.put("7", "Seven");

        numbersMap.put("8", "Eight");

        numbersMap.put("9", "Nine");

        for (String life : lives) {

            if (life.equals("1")) {

                count++;

            }

        }

        return numbersMap.get(Integer.toString(count));

    }

    // Method to decode the villain's name

    public String killVillain() {

        return mario.getVillain().replaceAll("[^a-zA-Z\\s]", "");

    }

}

public class Program3 {

    public static void main(String[] args) {

        Mario m = new Mario("1 1 1 1 0", "Tha@an%^os");

        PlayMario pm = new PlayMario(m);

        String ans = pm.lifeCheck();

        String res = pm.killVillain();

        System.out.println(ans);

        System.out.println(res);

    }

}
