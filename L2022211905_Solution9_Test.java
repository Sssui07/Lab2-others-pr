import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *写的不错 
 *测试类设计原则
 * 本测试类遵循等价类划分原则，通过不同输入条件对方法进行全面测试，确保其正确性。
 * 测试用例包括：
 * 1. 场景一：无不喜欢关系
 * 2. 场景二：存在互相讨厌关系
 * 3. 场景三：多个人之间复杂关系
 */
public class L2022211905_Solution9_Test {

    private final Solution9 solution = new Solution9();

    /**
     * 测试目的：验证在无不喜欢关系的情况下是否能够成功分组
     * 用到的测试用例：n=2, dislikes=[]
     */
    @Test
    public void testNoDislikes() {
        assertTrue(solution.possibleBipartition(2, new int[][] {}));
    }

    /**
     * 测试目的：验证三个人互相讨厌的情况能否分组
     * 用到的测试用例：n=3, dislikes=[[1, 2], [2, 3], [1, 3]]
     */
    @Test
    public void testMutualDislikes() {
        assertFalse(solution.possibleBipartition(3, new int[][] {{1, 2}, {2, 3}, {1, 3}}));
    }

    /**
     * 测试目的：验证简单的分组情况
     * 用到的测试用例：n=4, dislikes=[[1, 2], [1, 3], [2, 4]]
     */
    @Test
    public void testSimplePartition() {
        assertTrue(solution.possibleBipartition(4, new int[][] {{1, 2}, {1, 3}, {2, 4}}));
    }

    /**
     * 测试目的：验证复杂的分组情况，包含多个不喜欢关系
     * 用到的测试用例：n=5, dislikes=[[1, 2], [2, 3], [3, 4], [4, 5], [1, 5]]
     */
    @Test
    public void testComplexDislikes() {
        assertFalse(solution.possibleBipartition(5, new int[][] {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}}));
    }

    /**
     * 测试目的：验证多个复杂关系下的成功分组
     * 用到的测试用例：n=6, dislikes=[[1, 2], [1, 3], [2, 4], [5, 6]]
     */
    @Test
    public void testMultipleRelationships() {
        assertTrue(solution.possibleBipartition(6, new int[][] {{1, 2}, {1, 3}, {2, 4}, {5, 6}}));
    }
}
