class Main {
  public static void main(String[] args) {
    System.out.println("========Compound Assignment Operators===========");

    int score = 0;

    System.out.println(score);
    score = score + 1;
    System.out.println(score);
    score++; // increment variable by 1
    System.out.println(score);
    score += 1; // score = score +1
    System.out.println(score);
    score += 5; // score = score + 5
    System.out.println(score);

    System.out.println("============Subtract==================");

    score = score - 1;
    System.out.println(score);
    score--; // decrementing variable by 1
    System.out.println(score);
    score -= 1; // score = score -1;
    System.out.println(score);
    score -= 4; // score = score -4
    System.out.println(score);

    System.out.println("============Mult / Divide / Mod %==================");

    score *= 10; // score = score * 10
    System.out.println(score);
    score /= 2; // score = score /2
    System.out.println(score);
    score %= 2;
    System.out.println(score);

  }
}