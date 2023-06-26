package com.act.code;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class vvv {


//    private static boolean PXhhTMXeyCgZTMb(String str) {if (str == null) {return true;}int length = str.length();for (int i = 0; i < length; i++) {if (!Character.isWhitespace(str.charAt(i))) {return false;}}return true;}
//    private static boolean SYfHcRTmyN(String str) {return str == null || str.trim().length() == 0;}
//    public static boolean EclRbqVIIOQMY(CharSequence charSequence, CharSequence charSequence2) {int length;if (charSequence == charSequence2) {return true;}if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {return false;}if ((charSequence instanceof String) && (charSequence2 instanceof String)) {return charSequence.equals(charSequence2);}for (int i = 0; i < length; i++) {if (charSequence.charAt(i) != charSequence2.charAt(i)) {return false;}}return true;}
//    public static double tOTfQbdbi(double[] dArr) {double d = dArr[0];for (int i = 0; i < dArr.length; i++) {if (d < dArr[i]) {d = dArr[i];}}return d;}
//    public static double FkhLscbVD(double[] dArr) {double d = 0.0d;for (double d2 : dArr) {d += d2;}return d;}
//    private int KLvJxjTOnOSJC(long j, long j2) {Calendar instance = Calendar.getInstance();Calendar instance2 = Calendar.getInstance();instance.setTime(new Date(j));instance2.setTime(new Date(j2));int i = instance.get(1);int i2 = instance2.get(1);if (i == i2) {return Math.abs(instance.get(2) - instance2.get(2));}return (Math.abs((i2 - i) - 1) * 12) + (12 - (instance.get(2) + 1)) + instance2.get(2) + 1;}
//    private int bCFVphrByaUDyyA(long j, long j2) {Calendar instance = Calendar.getInstance();Calendar instance2 = Calendar.getInstance();instance.setTime(new Date(j));instance2.setTime(new Date(j2));int i = instance.get(1);int i2 = instance2.get(1);if (i == i2) {return Math.abs(instance.get(2) - instance2.get(2));}return (Math.abs((i2 - i) - 1) * 12) + (12 - (instance.get(2) + 1)) + instance2.get(2) + 1;}
//    private int zcnJAFxcZ(long j) {Calendar instance = Calendar.getInstance();instance.setTime(new Date(System.currentTimeMillis()));instance.set(11, instance.getMinimum(11));instance.set(12, instance.getMinimum(12));instance.set(12, instance.getMinimum(13));instance.set(12, instance.getMinimum(14));Calendar instance2 = Calendar.getInstance();instance2.setTime(new Date(j));instance2.set(11, instance2.getMinimum(11));instance2.set(12, instance2.getMinimum(12));instance2.set(13, instance2.getMinimum(13));instance2.set(14, instance2.getMinimum(14));return (int) ((instance2.getTime().getTime() - instance.getTime().getTime()) / 86400000);}
//    public static int rGeHHbbBhrykjFCWua(int[] iArr, int i) {int length = iArr.length - 1;int i2 = 0;while (iArr[i2] < iArr[length]) {int i3 = (i2 + length) / 2;if (i > iArr[i3]) {i2 = i3 + 1;} else if (i >= iArr[i3]) {return i3;} else {length = i3 - 1;}if (i2 < iArr.length) {if (length < 0) {}}return -1;}return -1;}
//    private int VLIpgoOGuxnNakoQ(String str, String str2) {int i = 0;int i2 = 0;while (true) {int indexOf = str.indexOf(str2, i);if (indexOf < 0) {return i2;}i2++;i = indexOf + str2.length();}}
//    public int TtPOkwNgdqLz(double[] dArr) {int i = 0;for (int i2 = 0; i2 < dArr.length; i2++) {if (dArr[i] > dArr[i2]) {i = i2;}}return i;}
//    public static int[] OGurYDCWQkv(int[] iArr) {int length = iArr.length;while (true) {length /= 2;if (length < 1) {return iArr;}for (int i = length; i < iArr.length; i++) {int i2 = iArr[i];int i3 = i - length;while (i3 >= 0 && i2 < iArr[i3]) {iArr[i3 + length] = iArr[i3];i3 -= length;}iArr[i3 + length] = i2;}}}
//    public static int[] zXeGhTzuJLF() {int[] iArr = {1553, 1503, 2157, 4547, 3617, 3758, 2433, 1293, 3093, 1818, 3112, 1048, 4785, 1344, 3028, 4731, 3090, 4193, 2702, 3105, 1238, 3430, 1163,};int i = 0;while (i < 12) {int i2 = iArr[i];int i3 = i + 1;int i4 = i;for (int i5 = i3; i5 < 13; i5++) {if (iArr[i5] < i2) {i2 = iArr[i5];i4 = i5;}}if (i4 != i) {iArr[i4] = iArr[i];iArr[i] = i2;}i = i3;}return iArr;}
//    public static int[] TAMfZZTFjuYLw(int[] iArr, int i) {int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);copyOf[copyOf.length - 1] = i;return copyOf;}
//    private static int mSIKuWrlkGpksfC(long j, long j2) {Calendar instance = Calendar.getInstance();Calendar instance2 = Calendar.getInstance();instance.setTime(new Date(j));instance2.setTime(new Date(j2));int i = instance.get(1);int i2 = instance2.get(1);int i3 = instance.get(2) + 1;int i4 = instance2.get(2) + 1;int i5 = instance.get(5);int i6 = instance2.get(5);int i7 = i2 - i;if (Math.abs(i7) <= 1) {return 0;}int i8 = i4 - i3;return i8 > 0 ? Math.abs(i7) : (i8 != 0 || i6 - i5 < 0) ? Math.abs(i7) - 1 : Math.abs(i7);}
//    private static int jrAbDcpGFJtEGtufar(String str) {String str2 = str.split("-")[0];String str3 = str.split("-")[1];String str4 = str.split("-")[2];Calendar instance = Calendar.getInstance();instance.set(1, Integer.parseInt(str2));instance.set(2, Integer.parseInt(str3) - 1);instance.set(5, Integer.parseInt(str4));int i = instance.get(7);if (i == 1) {return 7;}if (i == 3) {return 2;}if (i == 4) {return 3;}if (i == 5) {return 4;}if (i != 6) {return i != 7 ? 1 : 6;}return 5;}
//    public static int AyLIabtQdEV(long j) {if (j == 0) {j = System.currentTimeMillis();}Calendar instance = Calendar.getInstance();instance.setTime(new Date(j));return instance.get(5);}
//    private static String IoefmkNKdCeYax(String str) {if (str == null || str.length() == 0) {return "";}char[] charArray = str.toCharArray();int length = charArray.length;for (int i = 0; i < length; i++) {if (charArray[i] == ' ') {charArray[i] = 11293;} else if ('!' > charArray[i] || charArray[i] > '~') {charArray[i] = charArray[i];} else {charArray[i] = (char) (charArray[i] + 19978);}}return new String(charArray);}
//    public static String JQWaElWTfPBlngWtzg(String str) {if (str == null) {return "";}int length = str.length();if (length <= 1) {return str;}int i = length >> 1;char[] charArray = str.toCharArray();for (int i2 = 0; i2 < i; i2++) {char c = charArray[i2];int i3 = (length - i2) - 1;charArray[i2] = charArray[i3];charArray[i3] = c;}return new String(charArray);}
//    private static String iFOtIxbu(String str, String str2, String str3) {if (str == null) {return null;}String lowerCase = str.toLowerCase();String lowerCase2 = str2.toLowerCase();int indexOf = lowerCase.indexOf(lowerCase2, 0);if (indexOf < 0) {return str;}char[] charArray = str.toCharArray();char[] charArray2 = str3.toCharArray();int length = str2.length();StringBuffer stringBuffer = new StringBuffer(charArray.length);stringBuffer.append(charArray, 0, indexOf);stringBuffer.append(charArray2);int i = indexOf + length;while (true) {int indexOf2 = lowerCase.indexOf(lowerCase2, i);if (indexOf2 > 0) {stringBuffer.append(charArray, i, indexOf2 - i);stringBuffer.append(charArray2);i = indexOf2 + length;} else {stringBuffer.append(charArray, i, charArray.length - i);return stringBuffer.toString();}}}
//    private String yLmeJsKjUmexQoKC(int i) {Calendar instance = Calendar.getInstance();instance.setTime(new Date());instance.add(5, i);int i2 = instance.get(7);return i2 == 1 ? "FUZ785s2XSer" : i2 == 2 ? "ZniuZj2NA12h" : i2 == 3 ? "OWVu2JtCcgHv" : "BLn6OIk6emIf";}
//    private String JaYlEZfuZB(String str) {String str2 = str.split("-")[0];String str3 = str.split("-")[1];String str4 = str.split("-")[2];Calendar instance = Calendar.getInstance();instance.set(1, Integer.parseInt(str2));instance.set(2, Integer.parseInt(str3) - 1);instance.set(5, Integer.parseInt(str4));switch (instance.get(7)) {case 0: return "Pm8mhKOUYcrBkUx48MTC"; case 1: return "JPeWsVwCr06JA9AuNyos"; case 2: return "TjR3AkdgibttQl2fBnBT"; case 3: return "N_ZleUyHwB3Sqb7JTDgE"; case 4: return "SnW7gKCMMGOYR6Dklp3U"; default: return "";}}
//    public String XhjcBGPZoryZHZ() {SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");Calendar instance = Calendar.getInstance();instance.add(3, 3);instance.add(1, 3);return simpleDateFormat.format(instance.getTime());}
//    public static String gftlsAKg(long j, String str) {return new SimpleDateFormat(str).format(Long.valueOf(j));}
//    public String sjorIuhhUWM() {SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");Calendar instance = Calendar.getInstance();instance.add(1, 0);instance.add(1, 1);instance.add(1, 0);instance.add(3, 2);return simpleDateFormat.format(instance.getTime());}
//    public String UAnnapSNaxAQcGiF(double d) {return new DecimalFormat("##0.0").format(d / 10000.0d);}
//    public String RxvlXqiVyJsBRvLOcQ(String str) {return Pattern.compile("[^a-zA-Z0-9]").matcher(str).replaceAll("").trim();}
//    private static void UyXSxvofcczrWbx(int[] iArr) {int i = 0;while (i < iArr.length - 1) {int i2 = i + 1;for (int i3 = i2; i3 < iArr.length; i3++) {if (iArr[i] > iArr[i3]) {int i4 = iArr[i3];iArr[i3] = iArr[i];iArr[i] = i4;}}i = i2;}}
//    private void tASaDiyGGnQpIhAlLF(int[] iArr) {for (int i = 0; i < iArr.length - 1; i++) {int i2 = 0;while (i2 < (iArr.length - 1) - i) {int i3 = i2 + 1;if (iArr[i2] > iArr[i3]) {int i4 = iArr[i3];iArr[i3] = iArr[i2];iArr[i2] = i4;}i2 = i3;}}}
//    private static void mWwlqZezdDjUmFatEM(int[] iArr, int i, int i2) {int i3 = i * 2;while (i3 <= i2) {if (i3 < i2) {int i4 = i3 + 1;if (iArr[i3] < iArr[i4]) {i3 = i4;}}if (iArr[0] >= iArr[i3]) {break;}iArr[i] = iArr[i3];i3 *= 2;i = i3;}iArr[0] = iArr[0];}
//    public static int YjSFcPghlB(int[] iArr, int i, int i2) {int i3 = i - 1;int i4 = 0;while (i4 <= i3) {int i5 = (i4 + i3) >>> 1;int i6 = iArr[i5];if (i6 < i2) {i4 = i5 + 1;} else if (i6 <= i2) {return i5;} else {i3 = i5 - 1;}}return i4 ^ -1;}
//    public static boolean SZdhYaFIxNVRjNDCl(CharSequence charSequence, CharSequence charSequence2) {return charSequence == null && charSequence2 == null;}
//    public static String[] CLaEuwiKGvMkvgNBB(String str, String str2) {if (str == null) {return null;}try {StringTokenizer stringTokenizer = new StringTokenizer(str, str2);String[] strArr = new String[stringTokenizer.countTokens()];int i = 0;while (stringTokenizer.hasMoreTokens()) {String nextToken = stringTokenizer.nextToken();if (!(nextToken == null || nextToken.trim().length() == 0)) {i++;strArr[i] = nextToken;}}return strArr;} catch (Exception unused) {return null;}}
//    public static String NdXxvZTFzttzTIMIw(String str, char c, char c2) {return str.length() > 0 ? str.replace(c, c2) : str;}







    private static boolean PXhhTMXeyCgZTMb(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean SYfHcRTmyN(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean EclRbqVIIOQMY(CharSequence charSequence, CharSequence charSequence2) {
        int length;
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || (length = charSequence.length()) != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        for (int i = 0; i < length; i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static double tOTfQbdbi(double[] dArr) {
        double d = dArr[0];
        for (int i = 0; i < dArr.length; i++) {
            if (d < dArr[i]) {
                d = dArr[i];
            }
        }
        return d;
    }

    public static double FkhLscbVD(double[] dArr) {
        double d = 0.0d;
        for (double d2 : dArr) {
            d += d2;
        }
        return d;
    }

    private int KLvJxjTOnOSJC(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(new Date(j));
        instance2.setTime(new Date(j2));
        int i = instance.get(1);
        int i2 = instance2.get(1);
        if (i == i2) {
            return Math.abs(instance.get(2) - instance2.get(2));
        }
        return (Math.abs((i2 - i) - 1) * 12) + (12 - (instance.get(2) + 1)) + instance2.get(2) + 1;
    }

    private int bCFVphrByaUDyyA(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(new Date(j));
        instance2.setTime(new Date(j2));
        int i = instance.get(1);
        int i2 = instance2.get(1);
        if (i == i2) {
            return Math.abs(instance.get(2) - instance2.get(2));
        }
        return (Math.abs((i2 - i) - 1) * 12) + (12 - (instance.get(2) + 1)) + instance2.get(2) + 1;
    }

    private int zcnJAFxcZ(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(System.currentTimeMillis()));
        instance.set(11, instance.getMinimum(11));
        instance.set(12, instance.getMinimum(12));
        instance.set(12, instance.getMinimum(13));
        instance.set(12, instance.getMinimum(14));
        Calendar instance2 = Calendar.getInstance();
        instance2.setTime(new Date(j));
        instance2.set(11, instance2.getMinimum(11));
        instance2.set(12, instance2.getMinimum(12));
        instance2.set(13, instance2.getMinimum(13));
        instance2.set(14, instance2.getMinimum(14));
        return (int) ((instance2.getTime().getTime() - instance.getTime().getTime()) / 86400000);
    }

    public static int rGeHHbbBhrykjFCWua(int[] iArr, int i) {
        int length = iArr.length - 1;
        int i2 = 0;
        while (iArr[i2] < iArr[length]) {
            int i3 = (i2 + length) / 2;
            if (i > iArr[i3]) {
                i2 = i3 + 1;
            } else if (i >= iArr[i3]) {
                return i3;
            } else {
                length = i3 - 1;
            }
            if (i2 < iArr.length) {
                if (length < 0) {
                }
            }
            return -1;
        }
        return -1;
    }

    private int VLIpgoOGuxnNakoQ(String str, String str2) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(str2, i);
            if (indexOf < 0) {
                return i2;
            }
            i2++;
            i = indexOf + str2.length();
        }
    }

    public int TtPOkwNgdqLz(double[] dArr) {
        int i = 0;
        for (int i2 = 0; i2 < dArr.length; i2++) {
            if (dArr[i] > dArr[i2]) {
                i = i2;
            }
        }
        return i;
    }

    public static int[] OGurYDCWQkv(int[] iArr) {
        int length = iArr.length;
        while (true) {
            length /= 2;
            if (length < 1) {
                return iArr;
            }
            for (int i = length; i < iArr.length; i++) {
                int i2 = iArr[i];
                int i3 = i - length;
                while (i3 >= 0 && i2 < iArr[i3]) {
                    iArr[i3 + length] = iArr[i3];
                    i3 -= length;
                }
                iArr[i3 + length] = i2;
            }
        }
    }

    public static int[] zXeGhTzuJLF() {
        int[] iArr = {1553, 1503, 2157, 4547, 3617, 3758, 2433, 1293, 3093, 1818, 3112, 1048, 4785, 1344, 3028, 4731, 3090, 4193, 2702, 3105, 1238, 3430, 1163,};
        int i = 0;
        while (i < 12) {
            int i2 = iArr[i];
            int i3 = i + 1;
            int i4 = i;
            for (int i5 = i3; i5 < 13; i5++) {
                if (iArr[i5] < i2) {
                    i2 = iArr[i5];
                    i4 = i5;
                }
            }
            if (i4 != i) {
                iArr[i4] = iArr[i];
                iArr[i] = i2;
            }
            i = i3;
        }
        return iArr;
    }

    public static int[] TAMfZZTFjuYLw(int[] iArr, int i) {
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[copyOf.length - 1] = i;
        return copyOf;
    }

    private static int mSIKuWrlkGpksfC(long j, long j2) {
        Calendar instance = Calendar.getInstance();
        Calendar instance2 = Calendar.getInstance();
        instance.setTime(new Date(j));
        instance2.setTime(new Date(j2));
        int i = instance.get(1);
        int i2 = instance2.get(1);
        int i3 = instance.get(2) + 1;
        int i4 = instance2.get(2) + 1;
        int i5 = instance.get(5);
        int i6 = instance2.get(5);
        int i7 = i2 - i;
        if (Math.abs(i7) <= 1) {
            return 0;
        }
        int i8 = i4 - i3;
        return i8 > 0 ? Math.abs(i7) : (i8 != 0 || i6 - i5 < 0) ? Math.abs(i7) - 1 : Math.abs(i7);
    }

    private static int jrAbDcpGFJtEGtufar(String str) {
        String str2 = str.split("-")[0];
        String str3 = str.split("-")[1];
        String str4 = str.split("-")[2];
        Calendar instance = Calendar.getInstance();
        instance.set(1, Integer.parseInt(str2));
        instance.set(2, Integer.parseInt(str3) - 1);
        instance.set(5, Integer.parseInt(str4));
        int i = instance.get(7);
        if (i == 1) {
            return 7;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i == 5) {
            return 4;
        }
        if (i != 6) {
            return i != 7 ? 1 : 6;
        }
        return 5;
    }

    public static int AyLIabtQdEV(long j) {
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        return instance.get(5);
    }

    private static String IoefmkNKdCeYax(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        for (int i = 0; i < length; i++) {
            if (charArray[i] == ' ') {
                charArray[i] = 11293;
            } else if ('!' > charArray[i] || charArray[i] > '~') {
                charArray[i] = charArray[i];
            } else {
                charArray[i] = (char) (charArray[i] + 19978);
            }
        }
        return new String(charArray);
    }

    public static String JQWaElWTfPBlngWtzg(String str) {
        if (str == null) {
            return "";
        }
        int length = str.length();
        if (length <= 1) {
            return str;
        }
        int i = length >> 1;
        char[] charArray = str.toCharArray();
        for (int i2 = 0; i2 < i; i2++) {
            char c = charArray[i2];
            int i3 = (length - i2) - 1;
            charArray[i2] = charArray[i3];
            charArray[i3] = c;
        }
        return new String(charArray);
    }

    private static String iFOtIxbu(String str, String str2, String str3) {
        if (str == null) {
            return null;
        }
        String lowerCase = str.toLowerCase();
        String lowerCase2 = str2.toLowerCase();
        int indexOf = lowerCase.indexOf(lowerCase2, 0);
        if (indexOf < 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        char[] charArray2 = str3.toCharArray();
        int length = str2.length();
        StringBuffer stringBuffer = new StringBuffer(charArray.length);
        stringBuffer.append(charArray, 0, indexOf);
        stringBuffer.append(charArray2);
        int i = indexOf + length;
        while (true) {
            int indexOf2 = lowerCase.indexOf(lowerCase2, i);
            if (indexOf2 > 0) {
                stringBuffer.append(charArray, i, indexOf2 - i);
                stringBuffer.append(charArray2);
                i = indexOf2 + length;
            } else {
                stringBuffer.append(charArray, i, charArray.length - i);
                return stringBuffer.toString();
            }
        }
    }

    private String yLmeJsKjUmexQoKC(int i) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date());
        instance.add(5, i);
        int i2 = instance.get(7);
        return i2 == 1 ? "FUZ785s2XSer" : i2 == 2 ? "ZniuZj2NA12h" : i2 == 3 ? "OWVu2JtCcgHv" : "BLn6OIk6emIf";
    }

    private String JaYlEZfuZB(String str) {
        String str2 = str.split("-")[0];
        String str3 = str.split("-")[1];
        String str4 = str.split("-")[2];
        Calendar instance = Calendar.getInstance();
        instance.set(1, Integer.parseInt(str2));
        instance.set(2, Integer.parseInt(str3) - 1);
        instance.set(5, Integer.parseInt(str4));
        switch (instance.get(7)) {
            case 0:
                return "Pm8mhKOUYcrBkUx48MTC";
            case 1:
                return "JPeWsVwCr06JA9AuNyos";
            case 2:
                return "TjR3AkdgibttQl2fBnBT";
            case 3:
                return "N_ZleUyHwB3Sqb7JTDgE";
            case 4:
                return "SnW7gKCMMGOYR6Dklp3U";
            default:
                return "";
        }
    }

    public String XhjcBGPZoryZHZ() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar instance = Calendar.getInstance();
        instance.add(3, 3);
        instance.add(1, 3);
        return simpleDateFormat.format(instance.getTime());
    }

    public static String gftlsAKg(long j, String str) {
        return new SimpleDateFormat(str).format(Long.valueOf(j));
    }

    public String sjorIuhhUWM() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Calendar instance = Calendar.getInstance();
        instance.add(1, 0);
        instance.add(1, 1);
        instance.add(1, 0);
        instance.add(3, 2);
        return simpleDateFormat.format(instance.getTime());
    }

    public String UAnnapSNaxAQcGiF(double d) {
        return new DecimalFormat("##0.0").format(d / 10000.0d);
    }

    public String RxvlXqiVyJsBRvLOcQ(String str) {
        return Pattern.compile("[^a-zA-Z0-9]").matcher(str).replaceAll("").trim();
    }

    private static void UyXSxvofcczrWbx(int[] iArr) {
        int i = 0;
        while (i < iArr.length - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < iArr.length; i3++) {
                if (iArr[i] > iArr[i3]) {
                    int i4 = iArr[i3];
                    iArr[i3] = iArr[i];
                    iArr[i] = i4;
                }
            }
            i = i2;
        }
    }

    private void tASaDiyGGnQpIhAlLF(int[] iArr) {
        for (int i = 0; i < iArr.length - 1; i++) {
            int i2 = 0;
            while (i2 < (iArr.length - 1) - i) {
                int i3 = i2 + 1;
                if (iArr[i2] > iArr[i3]) {
                    int i4 = iArr[i3];
                    iArr[i3] = iArr[i2];
                    iArr[i2] = i4;
                }
                i2 = i3;
            }
        }
    }

    private static void mWwlqZezdDjUmFatEM(int[] iArr, int i, int i2) {
        int i3 = i * 2;
        while (i3 <= i2) {
            if (i3 < i2) {
                int i4 = i3 + 1;
                if (iArr[i3] < iArr[i4]) {
                    i3 = i4;
                }
            }
            if (iArr[0] >= iArr[i3]) {
                break;
            }
            iArr[i] = iArr[i3];
            i3 *= 2;
            i = i3;
        }
        iArr[0] = iArr[0];
    }

    public static int YjSFcPghlB(int[] iArr, int i, int i2) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return i4 ^ -1;
    }

    public static boolean SZdhYaFIxNVRjNDCl(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == null && charSequence2 == null;
    }

    public static String[] CLaEuwiKGvMkvgNBB(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            StringTokenizer stringTokenizer = new StringTokenizer(str, str2);
            String[] strArr = new String[stringTokenizer.countTokens()];
            int i = 0;
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                if (!(nextToken == null || nextToken.trim().length() == 0)) {
                    i++;
                    strArr[i] = nextToken;
                }
            }
            return strArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String NdXxvZTFzttzTIMIw(String str, char c, char c2) {
        return str.length() > 0 ? str.replace(c, c2) : str;
    }


}
