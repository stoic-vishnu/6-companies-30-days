package Flipkart;

public class mountainarr_1095 {
    public int binaryright(int p, int t, MountainArray mountain) {
        int l = p, h = mountain.length() - 1, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            // if(mountain.get(mid)==t)
            // return mid;
            if (t < mountain.get(mid))
                l = mid + 1;
            else if (t > mountain.get(mid))
                h = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public int binaryleft(int p, int t, MountainArray mountain) {
        int l = 0, h = p, mid = 0;
        while (l <= h) {
            mid = (l + h) / 2;
            // if(mountain.get(mid)==t)
            // return mid;
            if (t > mountain.get(mid))
                l = mid + 1;
            else if (t < mountain.get(mid))
                h = mid - 1;
            else
                return mid;

        }
        return -1;
    }

    public int peak(MountainArray mountain) {
        int l = 0, h = mountain.length() - 1, mid = 0;
        while (l < h) {
            mid = (l + h) / 2;
            if (mountain.get(mid) >= mountain.get(mid + 1))
                h = mid;
            else
                l = mid + 1;
        }
        return l;
    }

    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peak(mountainArr);
        // if(mountainArr.get(peak)==target)
        // return peak;
        System.out.println(peak);
        int left = binaryleft(peak, target, mountainArr);
        int right = binaryright(peak, target, mountainArr);
        System.out.println(left);
        System.out.println(right);
        if (left == -1 && right == -1)
            return -1;
        if (left >= 0 && right >= 0) {
            return Math.min(left, right);
        }
        return left > right ? left : right;
    }
    public static void main(String[] args) {
        
    }
}
