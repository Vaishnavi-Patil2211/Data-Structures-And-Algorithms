
class newNode:
    def __init__(self, data):
        self.data = data
        self.left = self.right = None


def height(root, ans):
    if (root == None):
        return 0

    left_height = height(root.left, ans)

    right_height = height(root.right, ans)

    ans[0] = max(ans[0], 1 + left_height +
                 right_height)

    return 1 + max(left_height,
                   right_height)


def diameter(root):
    if (root == None):
        return 0
    ans = [-999999999999]
    height_of_tree = height(root, ans)
    return ans[0]


if __name__ == '__main__':
    root = newNode(1)
    root.left = newNode(2)
    root.right = newNode(3)
    root.left.left = newNode(4)
    root.left.right = newNode(5)

    print("Diameter is", diameter(root))
