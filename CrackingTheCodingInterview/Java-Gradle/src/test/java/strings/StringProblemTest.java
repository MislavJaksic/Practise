package strings;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class StringProblemTest {
	@Nested
	class IsUniqueTests {
		@Test
		public void EmptyStringTest() {
			String input = "";

			boolean expected = true;

			boolean actual = StringProblems.IsUnique(input);

			assertEquals(expected, actual);
		}

		@Test
		public void UniqueStringTest() {
			String input = "5498fscg";

			boolean expected = true;

			boolean actual = StringProblems.IsUnique(input);

			assertEquals(expected, actual);
		}

		@Test
		public void NonUniqueStringTest() {
			String input = "abcddefg";

			boolean expected = false;

			boolean actual = StringProblems.IsUnique(input);

			assertEquals(expected, actual);
		}
	}

	@Nested
	class IsPermutationTests {
		@Test
		public void EmptyStringTest() {
			String one = "";
			String two = "";

			boolean expected = true;

			boolean actual = StringProblems.IsPermutation(one, two);

			assertEquals(expected, actual);
		}

		@Test
		public void PermutationStringTest() {
			String one = "abbcccdddd";
			String two = "ddddcccbba";

			boolean expected = true;

			boolean actual = StringProblems.IsPermutation(one, two);

			assertEquals(expected, actual);
		}

		@Test
		public void NonPermutationCaseOneStringTest() {
			String one = "abbcccddd";
			String two = "ddddcccbba";

			boolean expected = false;

			boolean actual = StringProblems.IsPermutation(one, two);

			assertEquals(expected, actual);
		}

		@Test
		public void NonPermutationCaseTwoStringTest() {
			String one = "abbcccdddd";
			String two = "ddddcccbb";

			boolean expected = false;

			boolean actual = StringProblems.IsPermutation(one, two);

			assertEquals(expected, actual);
		}
	}

	@Nested
	class URLifyTests {
		@Test
		public void URLifyThreeWordsTest() {
			char[] string = { 'm', 'i', ' ', 's', 'l', 'a', 'v', ' ', 'j', 'a', ' ', ' ', ' ', ' ' };
			int true_length = 10;

			char[] expected = { 'm', 'i', '%', '2', '0', 's', 'l', 'a', 'v', '%', '2', '0', 'j', 'a' };

			char[] actual = StringProblems.URLify(string, true_length);

			assertArrayEquals(expected, actual);
		}

		@Test
		public void URLifyTwoWordsTest() {
			char[] string = { 'm', 'i', ' ', 's', 'l', 'a', 'v', ' ', ' ' };
			int true_length = 7;

			char[] expected = { 'm', 'i', '%', '2', '0', 's', 'l', 'a', 'v' };

			char[] actual = StringProblems.URLify(string, true_length);

			assertArrayEquals(expected, actual);
		}

		@Test
		public void URLifyOneWordsTest() {
			char[] string = { 'm', 'i' };
			int true_length = 2;

			char[] expected = { 'm', 'i' };

			char[] actual = StringProblems.URLify(string, true_length);

			assertArrayEquals(expected, actual);
		}
	}

	@Nested
	class PalindromePermutationTests {
		@Test
		public void EmptyStringTest() {
			String input = "";

			boolean expected = true;

			boolean actual = StringProblems.PalindromePermutation(input);

			assertEquals(expected, actual);
		}

		@Test
		public void EvenPalindromeTest() {
			String input = "aabbccdd";

			boolean expected = true;

			boolean actual = StringProblems.PalindromePermutation(input);

			assertEquals(expected, actual);
		}

		@Test
		public void OddPalindromeTest() {
			String input = "aabbccd";

			boolean expected = true;

			boolean actual = StringProblems.PalindromePermutation(input);

			assertEquals(expected, actual);
		}
		
		@Test
		public void NonPalindromeTest() {
			String input = "aabbcd";

			boolean expected = false;

			boolean actual = StringProblems.PalindromePermutation(input);

			assertEquals(expected, actual);
		}
	}
}
