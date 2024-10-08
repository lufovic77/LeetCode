package org.leetcode.bfs;

import org.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
    static class Solution {
        public static boolean isSameTree(TreeNode p, TreeNode q) {
            Queue<TreeNode> qForP = new LinkedList();
            Queue<TreeNode> qForQ = new LinkedList();
            qForP.add(p);
            qForQ.add(q);
            while (!qForP.isEmpty() && !qForQ.isEmpty()) {
                TreeNode tmpP = qForP.peek();
                TreeNode tmpQ = qForQ.peek();
                if((tmpP != null && tmpQ == null) || (tmpP == null && tmpQ != null)){
                    return false;
                }
                qForP.remove();
                qForQ.remove();
                if(tmpP==null && tmpQ == null)
                    continue;
                if (tmpP.val != tmpQ.val) {
                    return false;
                }
                qForP.add(tmpP.left);
                qForP.add(tmpP.right);
                qForQ.add(tmpQ.left);
                qForQ.add(tmpQ.right);
            }
            return qForP.isEmpty() && qForQ.isEmpty();
        }
    }

    public static void main(String[] args) {
        System.out.println(Solution.isSameTree(new TreeNode(1, null, null),
            new TreeNode(1, null, null)));
    }
}
