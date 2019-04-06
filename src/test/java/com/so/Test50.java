package com.so;

import org.junit.Test;

import static com.so.MinCParent50.*;

/**
 * 第50题
 * 寻找树的两个节点的最低公共祖先
 *
 * @author qgl
 * @date 2019/04/06
 */
public class Test50 {

    @Test
    public void test50() throws Exception {
        MinCParent50.BinaryTreeNode A = new MinCParent50.BinaryTreeNode(4);
        MinCParent50.BinaryTreeNode B = new MinCParent50.BinaryTreeNode(2);
        MinCParent50.BinaryTreeNode C = new MinCParent50.BinaryTreeNode(6);
        MinCParent50.BinaryTreeNode D = new MinCParent50.BinaryTreeNode(1);
        MinCParent50.BinaryTreeNode E = new MinCParent50.BinaryTreeNode(3);
        MinCParent50.BinaryTreeNode F = new MinCParent50.BinaryTreeNode(5);
        MinCParent50.BinaryTreeNode G = new MinCParent50.BinaryTreeNode(7);
        A.leftNode = B;
        A.rightNode = C;
        B.leftNode = D;
        B.rightNode = E;
        C.leftNode = F;
        C.rightNode = G;
        
        MinCParent50.BinaryTreeNode res1 = getLowestCommonAncestor1(null, A, D, E);
        MinCParent50.BinaryTreeNode res2 = getLowestCommonAncestor2(A, E, F);
        System.out.println("1 和 3 的最低公共祖先是：" + res1.value);
        System.out.println("3 和 5 的最低公共祖先是：" + res2.value);
    }
}
