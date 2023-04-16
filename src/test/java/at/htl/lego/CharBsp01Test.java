package at.htl.lego;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CharBsp01Test {

    @Test
    void toUpperCase_convertLowerCaseChar_ok() {
        // arrange

        // act
        char actual = CharBsp01.toUpperCase('b');

        //assert
        assertThat(actual).isUpperCase().isEqualTo('B');
    }
}