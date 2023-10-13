package com.shredder.studentws;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentEntityWsApplicationTests {

	@Test
	void contextLoads() {
	}
	public class PrintEvenCharacters {
    public static void main(String[] args) {
        String input = "I love my country";
        printEvenCharacters(input);
    }

    private static void printEvenCharacters(String input) {
        for (int i = 0; i < input.length(); i += 2) {
            char character = input.charAt(i);
            if (character != ' ') {
                System.out.print(character);
            }
        }
    }
}

}
