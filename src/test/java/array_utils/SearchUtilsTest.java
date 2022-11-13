package array_utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SearchUtilsTest {

    @Test
    void shouldFindWithBinarySearch() {
        // given
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // when
        int index = SearchUtils.binarySearch(arr, 4);

        // then
        assertThat(index).isEqualTo(3);
    }

    @Test
    void shouldNotFindWithBinarySearch() {
        // given
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // when
        int index = SearchUtils.binarySearch(arr, 10);

        // then
        assertThat(index).isEqualTo(-1);
    }

}