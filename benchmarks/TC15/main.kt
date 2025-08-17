fun interpolationSearch(arr: IntArray, lo: Int,
                        hi: Int, x: Int): Int {
    val pos: Int

    if (lo <= hi && x >= arr[lo] && x <= arr[hi]) {

        pos = (lo
                + ((hi - lo) / (arr[hi] - arr[lo])
                * (x - arr[lo])))

        if (arr[pos] == x) return pos

        if (arr[pos] < x) return interpolationSearch(arr, pos + 1, hi,
                x)

        if (arr[pos] > x) return interpolationSearch(arr, lo, pos - 1,
                x)
    }
    return -1
}

fun main() {
    val array = IntArray(5)
    array[0] = 4
    array[1] = 5
    array[2] = 6
    array[3] = 7
    array[4] = 8
    assert(interpolationSearch(array, 0, 4, 8) == 5, {"Element index should be 4"})
}