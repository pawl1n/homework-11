package array_utils;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SortUtilsTest {

    @Test
    void shouldBeSortedWithBubbleSort() {
        // given
        int[] arr = { 2, 6, 9, 8, 4, 5, 7, 10, 3, 1 };

        // when
        SortUtils.bubbleSort(arr);

        // then
        int[] sortedArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        assertThat(arr).isEqualTo(sortedArr);
    }

}