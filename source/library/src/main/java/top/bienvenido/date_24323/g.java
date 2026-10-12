package top.bienvenido.date_24323;

import android.telephony.SubscriptionInfo;
import java.security.SecureRandom;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/g.class */
public final class g {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public static final String f110;

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final String f111;

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public static final ArrayList f112;

    static {
        ArrayList arrayListArrayListOf;
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 16; i++) {
            sb.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".charAt(secureRandom.nextInt(36)));
        }
        f110 = sb.toString();
        SecureRandom secureRandom2 = new SecureRandom();
        StringBuilder sb2 = new StringBuilder(new String[]{"35133133", "86576905", "86811305", "86538206", "35619596", "86415006", "86953506", "86866106"}[secureRandom2.nextInt(8)]);
        for (int i2 = 0; i2 < 6; i2++) {
            sb2.append(secureRandom2.nextInt(10));
        }
        String string = sb2.toString();
        int iCharAt = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < 14; i4++) {
            if (i4 % 2 == 0) {
                iCharAt = (string.charAt(i4) + iCharAt) - 48;
            } else {
                int iCharAt2 = (string.charAt(i4) - '0') * 2;
                i3 = iCharAt2 < 10 ? i3 + iCharAt2 : ((i3 + 1) + iCharAt2) - 10;
            }
        }
        int i5 = (iCharAt + i3) % 10;
        sb2.append(i5 == 0 ? '0' : (char) (58 - i5));
        f111 = sb2.toString();
        try {
            if (AbstractC0065x6082d607.f499) {
                SubscriptionInfo[] subscriptionInfoArr = new SubscriptionInfo[1];
                SubscriptionInfo subscriptionInfo = (SubscriptionInfo) ca.f51.allocateInstance(SubscriptionInfo.class);
                try {
                    Pair pair = TuplesKt.to("mDisplayName", "Three.62v.net");
                    String str = f110;
                    Pair pair2 = TuplesKt.to("mIccId", str);
                    Pair pair3 = TuplesKt.to("mCarrierName", "Three.62v.net");
                    Pair pair4 = TuplesKt.to("mNumber", String.valueOf(System.currentTimeMillis()));
                    Pair pair5 = TuplesKt.to("mCountryIso", "826");
                    Pair[] pairArr = new Pair[5];
                    pairArr[0] = pair;
                    pairArr[1] = pair2;
                    pairArr[2] = pair3;
                    pairArr[3] = pair4;
                    pairArr[4] = pair5;
                    for (int i6 = 0; i6 < 5; i6++) {
                        Pair pair6 = pairArr[i6];
                        new p2((String) pair6.getFirst()).f270.mo394(subscriptionInfo, pair6.getSecond());
                    }
                    if (AbstractC0065x6082d607.f504xb7bf1d91) {
                        Pair pair7 = TuplesKt.to("mGroupOwner", "");
                        Pair pair8 = TuplesKt.to("mCardString", str);
                        String[] strArr = i.f161;
                        Pair pair9 = TuplesKt.to("mEhplmns", strArr);
                        Pair pair10 = TuplesKt.to("mHplmns", strArr);
                        Pair[] pairArr2 = new Pair[4];
                        pairArr2[0] = pair7;
                        pairArr2[1] = pair8;
                        pairArr2[2] = pair9;
                        pairArr2[3] = pair10;
                        for (int i7 = 0; i7 < 4; i7++) {
                            Pair pair11 = pairArr2[i7];
                            new p2((String) pair11.getFirst()).f270.mo394(subscriptionInfo, pair11.getSecond());
                        }
                    }
                } catch (Exception unused) {
                }
                Unit unit = Unit.INSTANCE;
                subscriptionInfoArr[0] = subscriptionInfo;
                arrayListArrayListOf = CollectionsKt.arrayListOf(subscriptionInfoArr);
            } else {
                arrayListArrayListOf = null;
            }
        } catch (Throwable unused2) {
        }
        f112 = arrayListArrayListOf;
    }
}
