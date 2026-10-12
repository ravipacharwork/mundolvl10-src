/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.telephony.SubscriptionInfo
 *  kotlin.Pair
 *  kotlin.TuplesKt
 *  kotlin.collections.CollectionsKt
 */
package top.bienvenido.date_24323;

import android.telephony.SubscriptionInfo;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import top.bienvenido.date_24323.ca;
import top.bienvenido.date_24323.i;
import top.bienvenido.date_24323.p2;
import top.bienvenido.date_24323.\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1;

public final class g {
    public static final String \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
    public static final String \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403;
    public static final ArrayList \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        Object object;
        block18: {
            Object[] objectArray;
            int n10;
            StringBuilder stringBuilder;
            SecureRandom secureRandom;
            int n11;
            SecureRandom secureRandom2;
            StringBuilder stringBuilder2;
            Object object2 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
            CharSequence charSequence = stringBuilder2;
            stringBuilder2 = new StringBuilder();
            int n12 = 36;
            SecureRandom secureRandom3 = secureRandom2;
            secureRandom2 = new SecureRandom();
            for (n11 = 0; n11 < 16; ++n11) {
                charSequence.append(((String)object2).charAt(secureRandom3.nextInt(n12)));
            }
            \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070 = charSequence.toString();
            object2 = secureRandom;
            charSequence = (new String[]{"35133133", "86576905", "86811305", "86538206", "35619596", "86415006", "86953506", "86866106"})[new SecureRandom().nextInt(8)];
            StringBuilder stringBuilder3 = stringBuilder;
            stringBuilder = new StringBuilder((String)charSequence);
            for (n10 = 0; n10 < 6; ++n10) {
                stringBuilder3.append(((Random)object2).nextInt(10));
            }
            object2 = stringBuilder3.toString();
            int n13 = 0;
            n11 = 0;
            for (n10 = 0; n10 < 14; ++n10) {
                if (n10 % 2 == 0) {
                    n13 = ((String)object2).charAt(n10) + n13 - 48;
                    continue;
                }
                int n14 = (((String)object2).charAt(n10) - 48) * 2;
                if (n14 < 10) {
                    n11 += n14;
                    continue;
                }
                n11 = n11 + 1 + n14 - 10;
            }
            char c10 = (n13 + n11) % 10;
            c10 = c10 == '\u0000' ? (char)'0' : (char)((char)(58 - c10));
            StringBuilder stringBuilder4 = stringBuilder3;
            stringBuilder4.append(c10);
            \u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403 = stringBuilder4.toString();
            try {
                block19: {
                    if (!\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403) break block18;
                    object = new SubscriptionInfo[1];
                    n10 = 0;
                    stringBuilder3 = (SubscriptionInfo)ca.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070.allocateInstance(SubscriptionInfo.class);
                    Pair pair = TuplesKt.to((Object)"mDisplayName", (Object)"Three.62v.net");
                    String string = \u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070;
                    Pair pair2 = TuplesKt.to((Object)"mIccId", (Object)string);
                    Object object3 = TuplesKt.to((Object)"mCarrierName", (Object)"Three.62v.net");
                    Pair[] pairArray = TuplesKt.to((Object)"mNumber", (Object)String.valueOf(System.currentTimeMillis()));
                    Pair pair3 = TuplesKt.to((Object)"mCountryIso", (Object)"826");
                    Pair[] pairArray2 = new Pair[5];
                    Pair[] pairArray3 = pairArray2;
                    pairArray2[0] = pair;
                    pairArray2[1] = pair2;
                    pairArray2[2] = object3;
                    pairArray2[3] = pairArray;
                    pairArray2[4] = pair3;
                    int n15 = 5;
                    for (int i10 = 0; i10 < n15; ++i10) {
                        Pair pair4 = pairArray3[i10];
                        object3 = (String)pair4.getFirst();
                        pairArray = pair4.getSecond();
                        new p2((String)object3).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)stringBuilder3, (Object)pairArray);
                    }
                    if (!\u7236\u6bcd\u4eec\u60ac\u6302\u6811\u6728\u4ece\u5c38\u4f53\u4e2d\u517b\u732a\u8ba9\u7075\u8f66\u6f02\u6d6e\u8df3\u8fc7\u575f\u5893\u87ba\u65cb\u7206\u70b8\u7802\u7eb8\u6253\u78e8\u68fa\u6750\u51b2\u6d6a\u706b\u70e7\u7528\u5c38\u4f53\u6ce1\u8336\u5c06\u7c73\u4e0e\u9aa8\u7070\u6df7\u5408\u5728\u7956\u575f\u524d\u5531\u6b4c\u4ee5\u53ca\u57cb\u846c\u805a\u4f1a\u846c\u793c\u5e86\u5178\u9aa8\u9ad3\u6c64\u6d47\u8111\u82b1\u68fa\u6750\u5f00\u82b1.\u4f60\u5988\u5728\u4e07\u4eba\u5e7f\u573a\u5356\u903c\u4f60\u5e9f\u7269\u7239\u4e0d\u4ec5\u4e0d\u963b\u6b62\u53cd\u800c\u8ddf\u4f60\u5988\u4e00\u8d77\u8ddf\u5929\u4e0b\u4eba\u6c11\u666e\u5929\u540c\u5e86\u4f60\u6bcf\u665a\u8349\u4f60\u5988\u751f\u9f99\u6d3b\u864e\u4f60\u5988\u75bc\u7684\u5472\u7259\u54a7\u5634\u4f60\u5988\u903c\u4e0a\u7684\u9634\u9f7f\u90fd\u6ee1\u8db3\u4e0d\u4e86\u4f60\u8fd9\u6742\u79cd\u7684\u72c2\u91ce\u6027\u9700\u6c42\u554a\u8349\u4f60\u5988) break block19;
                    Pair pair5 = TuplesKt.to((Object)"mGroupOwner", (Object)"");
                    string = TuplesKt.to((Object)"mCardString", (Object)string);
                    String string2 = "mEhplmns";
                    Object object4 = i.\u4f60\u7239\u6211\u4e00\u987f\u66b4\u6253\u63cd\u7684\u4f60\u778e\u5988\u7684\u5b50\u5bab\u6253\u6210\u7a00\u5df4\u70c2\u6d46\u7cca\u7136\u540e\u628a\u4f60\u8822\u5988\u7684\u80a0\u5b50\u90fd\u62c9\u51fa\u6765\u505a\u6210\u7f8e\u5473\u53ef\u53e3\u7684\u9999\u80a0\u5927\u53d1\u6148\u60b2\u5582\u7ed9\u8def\u8fb9\u7684\u90a3\u4e9b\u6d41\u6d6a\u6c49\u5403;
                    object3 = TuplesKt.to((Object)string2, (Object)object4);
                    object4 = TuplesKt.to((Object)"mHplmns", (Object)object4);
                    Pair[] pairArray4 = new Pair[4];
                    pairArray = pairArray4;
                    try {
                        pairArray4[0] = pair5;
                        pairArray4[1] = string;
                        pairArray4[2] = object3;
                        pairArray4[3] = object4;
                        int n16 = 4;
                        for (int i11 = 0; i11 < n16; ++i11) {
                            Pair pair6 = pairArray[i11];
                            object4 = (String)pair6.getFirst();
                            object3 = pair6.getSecond();
                            new p2((String)object4).\u8981\u4e0d\u8981\u628a\u4f60\u5988\u5375\u5b50\u6263\u51fa\u6765\u7ed9\u4f60\u505a\u5bff\u53f8\u5403.\u72c2\u72ac\u75ab\u82d7\u5fd8\u4e86\u7ed9\u4f60\u5988\u6253\u4e0d\u597d\u610f\u601d\u8ba9\u5b83\u5230\u5904\u54ac\u4eba\u624d\u4f1a\u751f\u51fa\u4f60\u8fd9\u79cd\u4e0a\u7f3a\u8111\u5b50\u4e0b\u7f3a\u903c\u706b\u846c\u573a\u90fd\u4e0d\u6536\u7684\u70c2\u9aa8\u7070((Object)stringBuilder3, object3);
                        }
                    }
                    catch (Exception exception) {}
                }
                Object[] objectArray2 = object;
                objectArray = object;
            }
            catch (Throwable throwable) {}
            objectArray2[n10] = stringBuilder3;
            object = CollectionsKt.arrayListOf((Object[])objectArray);
        }
        object = null;
        \u6211\u8981\u9001\u4f60\u5988\u4e00\u6735\u82b1\u54c8\u54c8\u54c8\u5f00\u73a9\u7b11\u7684\u6211\u54ea\u6765\u7684\u82b1\u4f60\u54ea\u6765\u7684\u5988 = object;
    }
}

