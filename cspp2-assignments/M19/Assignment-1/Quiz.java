class Quiz {
	String question;
	String[] choices;
	int correctchoice;
	int maxmarks;
	int penalty;
	String answer;
	public Quiz() {
	}
	public Quiz(String ans) {
		this.answer = ans;
	}
	public Quiz(String ques, String[] choices, int correctans, int max, int pen) {
		this.question = ques;
		this.choices = choices;
		this.correctchoice = correctans;
		this.maxmarks = max;
		this.penalty = pen;
	}
	public String getCorrectchoice() {
		return this.choices[this.correctchoice - 1];
	}
	public String getAnswer() {
		return this.answer;
	}
	public int getScore() {
		return this.maxmarks;
	}
	public int getPenalty() {
		return this.penalty;
	}
	public String getQuestion() {
		return this.question;
	}
	public void printQuestion() {
		System.out.println(this.question+"("+this.maxmarks+")");
		int i;
		for (i = 0; i < this.choices.length - 1; i++) {
			System.out.print(this.choices[i]+"	");
		}System.out.print(this.choices[i]);
		System.out.println();
	}
}