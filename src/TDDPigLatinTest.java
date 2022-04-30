import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class TDDPigLatinTest extends TDDPigLatin {

	@Test
	void toLowerTest() {
		String w1 = "ALLCAPS";
		String w2 = "iAMCaps";
		assertEquals("allcaps", TDDPigLatin.toLower(w1));
		assertEquals("iamcaps", TDDPigLatin.toLower(w2));

	}

	@Test
	void containSpecialCharTest() {
		String w1 = "!dfasdf";
		String w2 = "sdsd223df";
		String w3 = "dfasdf.";
		String w4 = "nospecialcharacter";
		assertEquals(true, TDDPigLatin.containSpecialChar(w1));
		assertEquals(true, TDDPigLatin.containSpecialChar(w2));
		assertEquals(true, TDDPigLatin.containSpecialChar(w3));
		assertEquals(false, TDDPigLatin.containSpecialChar(w4));
	}

	@Test
	void consonantORVowelTest() {
		String w1 = "infinite";
		String w2 = "yawn";
		String w3 = "alpine";
		String w4 = "under";
		String w5 = "eSCape";
		String w6 = "oSCape";
		String w7 = "1SCape";
		String w8 = "cSCape";
		String w9 = "dSCape";

		assertEquals(true, TDDPigLatin.consonantORVowel(w1));
		assertEquals(true, TDDPigLatin.consonantORVowel(w2));
		assertEquals(true, TDDPigLatin.consonantORVowel(w3));
		assertEquals(true, TDDPigLatin.consonantORVowel(w4));
		assertEquals(true, TDDPigLatin.consonantORVowel(w5));
		assertEquals(true, TDDPigLatin.consonantORVowel(w6));
		assertEquals(false, TDDPigLatin.consonantORVowel(w7));
		assertEquals(false, TDDPigLatin.consonantORVowel(w8));
		assertEquals(false, TDDPigLatin.consonantORVowel(w9));
	}

	@Test
	void consonantSubTranslateTest() {
		String w1 = "yawn";
		String w2 = "dawn";
		String w3 = "brawn";
		String w4 = "thwart";
		String w5 = "1SCape";

		assertEquals(0, TDDPigLatin.consonantSubTranslate(w1));
		assertEquals(1, TDDPigLatin.consonantSubTranslate(w2));
		assertEquals(2, TDDPigLatin.consonantSubTranslate(w3));
		assertEquals(3, TDDPigLatin.consonantSubTranslate(w4));
		assertEquals(3, TDDPigLatin.consonantSubTranslate(w5));

	}

	@Test
	void vowelTranslateTests() {
		String w1 = "Infinite";
		String w2 = "Yawn";
		String w3 = "AlpIne";
		String w4 = "Under";
		String w5 = "ESCape";

		assertEquals("infiniteway", TDDPigLatin.translate(w1));
		assertEquals("yawnway", TDDPigLatin.translate(w2));
		assertEquals("alpineway", TDDPigLatin.translate(w3));
		assertEquals("underway", TDDPigLatin.translate(w4));
		assertEquals("escapeway", TDDPigLatin.translate(w5));
	}

	@Test
	void consonatsTranslateTests() {
		// one consonant
		String w1 = "goal";
		String w2 = "dawn";
		// two consonants
		String w3 = "blunder";
		String w4 = "thunder";
		// three consonants
		String w5 = "scrap";
		String w6 = "screw";

		assertEquals("oalgay", TDDPigLatin.translate(w1));
		assertEquals("awnday", TDDPigLatin.translate(w2));
		assertEquals("underblay", TDDPigLatin.translate(w3));
		assertEquals("underthay", TDDPigLatin.translate(w4));
		assertEquals("apscray", TDDPigLatin.translate(w5));
		assertEquals("ewscray", TDDPigLatin.translate(w6));
	}

}
