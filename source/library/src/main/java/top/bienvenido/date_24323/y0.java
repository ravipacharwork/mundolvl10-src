package top.bienvenido.date_24323;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/y0.class */
public abstract class y0 {

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final n9 f417 = new n9(0);

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public final n9 f418 = new n9(0);

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final n9 f419 = new n9(0);

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final n9 f420 = new n9(0);

    /* JADX INFO: renamed from: 你妈今晚去偷电线杆子你爸去找电箱之后结合疯狂爆电让后在拿电线杆子ziwei完事还要去加油站在自己piyan和逼里灌油拿着打火机狂撩自己把自己变成内燃机, reason: contains not printable characters */
    public final n9 f421xaa30c2c7 = new n9(0);

    /* JADX INFO: renamed from: 你不知道你妈张个大嘴劈个小腿下面还流着咸盐水吗弟弟, reason: contains not printable characters */
    public final n9 f422 = new n9(0);

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public void mo520(IntentFilter intentFilter) {
        int i;
        Object objInvoke;
        Object objInvoke2;
        Object objInvoke3;
        Iterator<String> itSchemesIterator = intentFilter.schemesIterator();
        n9 n9Var = this.f420;
        if (itSchemesIterator == null) {
            i = 0;
        } else {
            int i2 = 0;
            while (itSchemesIterator.hasNext()) {
                i2++;
                int iHashCode = itSchemesIterator.next().hashCode();
                x0 x0Var = x0.f399;
                int[] iArr = n9Var.f253;
                int i3 = n9Var.f255;
                int iM2 = a.m2(iArr, i3, iHashCode);
                if (iM2 >= 0) {
                    objInvoke = n9Var.f254[iM2];
                } else {
                    int i4 = iM2 ^ (-1);
                    n9Var.f253 = m9.m315(iArr, i3, i4, iHashCode);
                    int i5 = i3 + 1;
                    n9Var.f255 = i5;
                    objInvoke = x0Var.invoke();
                    Object[] objArr = n9Var.f254;
                    Object[] objArr2 = objArr;
                    if (i5 <= objArr.length) {
                        System.arraycopy(objArr2, i4, objArr2, i4 + 1, i3 - i4);
                        objArr2[i4] = objInvoke;
                    } else {
                        Object[] objArr3 = new Object[(i3 | 1) << 1];
                        System.arraycopy(objArr2, 0, objArr3, 0, i4);
                        objArr3[i4] = objInvoke;
                        System.arraycopy(objArr2, i4, objArr3, i4 + 1, objArr2.length - i4);
                        objArr2 = objArr3;
                    }
                    n9Var.f254 = objArr2;
                }
                ((n9) objInvoke).m386(intentFilter.hashCode(), intentFilter);
            }
            i = i2;
        }
        int i6 = i;
        int iM572 = m572(intentFilter);
        if (i6 == 0 && iM572 == 0) {
            Iterator<String> itActionsIterator = intentFilter.actionsIterator();
            n9 n9Var2 = this.f421xaa30c2c7;
            if (itActionsIterator != null) {
                while (itActionsIterator.hasNext()) {
                    int iHashCode2 = itActionsIterator.next().hashCode();
                    x0 x0Var2 = x0.f399;
                    int[] iArr2 = n9Var2.f253;
                    int i7 = n9Var2.f255;
                    int iM3 = a.m2(iArr2, i7, iHashCode2);
                    if (iM3 >= 0) {
                        objInvoke3 = n9Var2.f254[iM3];
                    } else {
                        int i8 = iM3 ^ (-1);
                        n9Var2.f253 = m9.m315(iArr2, i7, i8, iHashCode2);
                        int i9 = i7 + 1;
                        n9Var2.f255 = i9;
                        objInvoke3 = x0Var2.invoke();
                        Object[] objArr4 = n9Var2.f254;
                        Object[] objArr5 = objArr4;
                        if (i9 <= objArr4.length) {
                            System.arraycopy(objArr5, i8, objArr5, i8 + 1, i7 - i8);
                            objArr5[i8] = objInvoke3;
                        } else {
                            Object[] objArr6 = new Object[(i7 | 1) << 1];
                            System.arraycopy(objArr5, 0, objArr6, 0, i8);
                            objArr6[i8] = objInvoke3;
                            System.arraycopy(objArr5, i8, objArr6, i8 + 1, objArr5.length - i8);
                            objArr5 = objArr6;
                        }
                        n9Var2.f254 = objArr5;
                    }
                    ((n9) objInvoke3).m386(intentFilter.hashCode(), intentFilter);
                }
            }
        }
        if (iM572 != 0) {
            Iterator<String> itActionsIterator2 = intentFilter.actionsIterator();
            n9 n9Var3 = this.f422;
            if (itActionsIterator2 == null) {
                return;
            }
            while (itActionsIterator2.hasNext()) {
                int iHashCode3 = itActionsIterator2.next().hashCode();
                x0 x0Var3 = x0.f399;
                int[] iArr3 = n9Var3.f253;
                int i10 = n9Var3.f255;
                int iM4 = a.m2(iArr3, i10, iHashCode3);
                if (iM4 >= 0) {
                    objInvoke2 = n9Var3.f254[iM4];
                } else {
                    int i11 = iM4 ^ (-1);
                    n9Var3.f253 = m9.m315(iArr3, i10, i11, iHashCode3);
                    int i12 = i10 + 1;
                    n9Var3.f255 = i12;
                    objInvoke2 = x0Var3.invoke();
                    Object[] objArr7 = n9Var3.f254;
                    Object[] objArr8 = objArr7;
                    if (i12 <= objArr7.length) {
                        System.arraycopy(objArr8, i11, objArr8, i11 + 1, i10 - i11);
                        objArr8[i11] = objInvoke2;
                    } else {
                        Object[] objArr9 = new Object[(i10 | 1) << 1];
                        System.arraycopy(objArr8, 0, objArr9, 0, i11);
                        objArr9[i11] = objInvoke2;
                        System.arraycopy(objArr8, i11, objArr9, i11 + 1, objArr8.length - i11);
                        objArr8 = objArr9;
                    }
                    n9Var3.f254 = objArr8;
                }
                ((n9) objInvoke2).m386(intentFilter.hashCode(), intentFilter);
            }
        }
    }

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃 */
    public abstract int mo7(IntentFilter intentFilter);

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public abstract Object mo6(IntentFilter intentFilter, int i, int i2);

    /* JADX INFO: renamed from: 我要送你妈一朵花哈哈哈开玩笑的我哪来的花你哪来的妈, reason: contains not printable characters */
    public final int m572(IntentFilter intentFilter) {
        String strIntern;
        Object objInvoke;
        Object obj;
        Iterator<String> itTypesIterator = intentFilter.typesIterator();
        if (itTypesIterator == null) {
            return 0;
        }
        int i = 0;
        while (itTypesIterator.hasNext()) {
            String next = itTypesIterator.next();
            String str = next;
            i++;
            int iIndexOf$default = StringsKt.indexOf$default(next, '/', 0, false, 6, (Object) null);
            if (iIndexOf$default > 0) {
                strIntern = StringsKt.take(str, iIndexOf$default).intern();
            } else {
                strIntern = str;
                str = str + "/*";
            }
            n9 n9Var = this.f417;
            int iHashCode = str.hashCode();
            x0 x0Var = x0.f399;
            int[] iArr = n9Var.f253;
            int i2 = n9Var.f255;
            int iM2 = a.m2(iArr, i2, iHashCode);
            if (iM2 >= 0) {
                objInvoke = n9Var.f254[iM2];
            } else {
                int i3 = iM2 ^ (-1);
                n9Var.f253 = m9.m315(iArr, i2, i3, iHashCode);
                int i4 = i2 + 1;
                n9Var.f255 = i4;
                objInvoke = x0Var.invoke();
                Object[] objArr = n9Var.f254;
                Object[] objArr2 = objArr;
                if (i4 <= objArr.length) {
                    System.arraycopy(objArr2, i3, objArr2, i3 + 1, i2 - i3);
                    objArr2[i3] = objInvoke;
                } else {
                    Object[] objArr3 = new Object[(i2 | 1) << 1];
                    System.arraycopy(objArr2, 0, objArr3, 0, i3);
                    objArr3[i3] = objInvoke;
                    System.arraycopy(objArr2, i3, objArr3, i3 + 1, objArr2.length - i3);
                    objArr2 = objArr3;
                }
                n9Var.f254 = objArr2;
            }
            ((n9) objInvoke).m386(intentFilter.hashCode(), intentFilter);
            n9 n9Var2 = iIndexOf$default > 0 ? this.f418 : this.f419;
            int iHashCode2 = strIntern.hashCode();
            int[] iArr2 = n9Var2.f253;
            int i5 = n9Var2.f255;
            int iM3 = a.m2(iArr2, i5, iHashCode2);
            if (iM3 >= 0) {
                obj = n9Var2.f254[iM3];
            } else {
                int i6 = iM3 ^ (-1);
                n9Var2.f253 = m9.m315(iArr2, i5, i6, iHashCode2);
                int i7 = i5 + 1;
                n9Var2.f255 = i7;
                Object objInvoke2 = x0Var.invoke();
                Object[] objArr4 = n9Var2.f254;
                Object[] objArr5 = objArr4;
                if (i7 <= objArr4.length) {
                    System.arraycopy(objArr5, i6, objArr5, i6 + 1, i5 - i6);
                    objArr5[i6] = objInvoke2;
                } else {
                    Object[] objArr6 = new Object[(i5 | 1) << 1];
                    System.arraycopy(objArr5, 0, objArr6, 0, i6);
                    objArr6[i6] = objInvoke2;
                    System.arraycopy(objArr5, i6, objArr6, i6 + 1, objArr5.length - i6);
                    objArr5 = objArr6;
                }
                n9Var2.f254 = objArr5;
                obj = objInvoke2;
            }
            ((n9) obj).m386(intentFilter.hashCode(), intentFilter);
        }
        return i;
    }

    /* JADX INFO: renamed from: 你爹我一顿暴打揍的你瞎妈的子宫打成稀巴烂浆糊然后把你蠢妈的肠子都拉出来做成美味可口的香肠大发慈悲喂给路边的那些流浪汉吃, reason: contains not printable characters */
    public final int m573(IntentFilter intentFilter) {
        String strIntern;
        Iterator<String> itTypesIterator = intentFilter.typesIterator();
        if (itTypesIterator == null) {
            return 0;
        }
        int i = 0;
        while (itTypesIterator.hasNext()) {
            String next = itTypesIterator.next();
            String str = next;
            i++;
            int iIndexOf$default = StringsKt.indexOf$default(next, '/', 0, false, 6, (Object) null);
            if (iIndexOf$default > 0) {
                strIntern = StringsKt.take(str, iIndexOf$default).intern();
            } else {
                strIntern = str;
                str = str + "/*";
            }
            n9 n9Var = this.f417;
            int iHashCode = str.hashCode();
            n9 n9Var2 = (n9) n9Var.m385(iHashCode);
            if (n9Var2 != null && n9Var2.m388(intentFilter.hashCode()) && n9Var2.f255 == 0) {
                n9Var.m388(iHashCode);
            }
            n9 n9Var3 = iIndexOf$default > 0 ? this.f418 : this.f419;
            int iHashCode2 = strIntern.hashCode();
            n9 n9Var4 = (n9) n9Var3.m385(iHashCode2);
            if (n9Var4 != null && n9Var4.m388(intentFilter.hashCode()) && n9Var4.f255 == 0) {
                n9Var3.m388(iHashCode2);
            }
        }
        return i;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public void mo521(C0058 c0058) {
        int i;
        Iterator<String> itSchemesIterator = c0058.schemesIterator();
        n9 n9Var = this.f420;
        if (itSchemesIterator == null) {
            i = 0;
        } else {
            int i2 = 0;
            while (itSchemesIterator.hasNext()) {
                i2++;
                int iHashCode = itSchemesIterator.next().hashCode();
                n9 n9Var2 = (n9) n9Var.m385(iHashCode);
                if (n9Var2 != null && n9Var2.m388(c0058.hashCode()) && n9Var2.f255 == 0) {
                    n9Var.m388(iHashCode);
                }
            }
            i = i2;
        }
        int i3 = i;
        int iM573 = m573(c0058);
        if (i3 == 0 && iM573 == 0) {
            Iterator<String> itActionsIterator = c0058.actionsIterator();
            n9 n9Var3 = this.f421xaa30c2c7;
            if (itActionsIterator != null) {
                while (itActionsIterator.hasNext()) {
                    int iHashCode2 = itActionsIterator.next().hashCode();
                    n9 n9Var4 = (n9) n9Var3.m385(iHashCode2);
                    if (n9Var4 != null && n9Var4.m388(c0058.hashCode()) && n9Var4.f255 == 0) {
                        n9Var3.m388(iHashCode2);
                    }
                }
            }
        }
        if (iM573 != 0) {
            Iterator<String> itActionsIterator2 = c0058.actionsIterator();
            n9 n9Var5 = this.f422;
            if (itActionsIterator2 == null) {
                return;
            }
            while (itActionsIterator2.hasNext()) {
                int iHashCode3 = itActionsIterator2.next().hashCode();
                n9 n9Var6 = (n9) n9Var5.m385(iHashCode3);
                if (n9Var6 != null && n9Var6.m388(c0058.hashCode()) && n9Var6.f255 == 0) {
                    n9Var5.m388(iHashCode3);
                }
            }
        }
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final ArrayList m571(Intent intent, String str, boolean z, int i) {
        int iIndexOf$default;
        n9 n9Var;
        String scheme = intent.getScheme();
        ArrayList arrayList = new ArrayList();
        n9 n9Var2 = null;
        n9 n9Var3 = null;
        n9 n9Var4 = null;
        n9 n9Var5 = null;
        String action = intent.getAction();
        if (str != null && (iIndexOf$default = StringsKt.indexOf$default(str, '/', 0, false, 6, (Object) null)) > 0) {
            if (iIndexOf$default != 1 || str.charAt(0) != '*') {
                int iHashCode = StringsKt.take(str, iIndexOf$default).hashCode();
                if (str.length() == iIndexOf$default + 2 && str.charAt(iIndexOf$default + 1) == '*') {
                    n9Var = (n9) this.f418.m385(iHashCode);
                } else {
                    n9Var = (n9) this.f417.m385(str.hashCode());
                }
                n9 n9Var6 = (n9) this.f419.m385(iHashCode);
                n9Var4 = (n9) this.f419.m385(42);
                n9 n9Var7 = n9Var;
                n9Var3 = n9Var6;
                n9Var2 = n9Var7;
            } else if (action != null) {
                n9Var2 = (n9) this.f422.m385(action.hashCode());
            }
        }
        if (scheme != null) {
            n9Var5 = (n9) this.f420.m385(scheme.hashCode());
        } else if (str == null && action != null) {
            n9Var2 = (n9) this.f421xaa30c2c7.m385(action.hashCode());
        }
        n9 n9Var8 = n9Var2;
        Set<String> categories = intent.getCategories();
        p9 p9Var = new p9(8);
        if (n9Var8 != null) {
            m574(intent, categories, z, str, scheme, n9Var2, arrayList, i, p9Var);
        }
        if (n9Var3 != null) {
            m574(intent, categories, z, str, scheme, n9Var3, arrayList, i, p9Var);
        }
        if (n9Var4 != null) {
            m574(intent, categories, z, str, scheme, n9Var4, arrayList, i, p9Var);
        }
        if (n9Var5 == null) {
            return arrayList;
        }
        m574(intent, categories, z, str, scheme, n9Var5, arrayList, i, p9Var);
        return arrayList;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public boolean mo522(String str, IntentFilter intentFilter) {
        return true;
    }

    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰, reason: contains not printable characters */
    public final void m574(Intent intent, Set set, boolean z, String str, String str2, n9 n9Var, ArrayList arrayList, int i, p9 p9Var) {
        int iMo7;
        int iM2;
        Object objMo6;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        int i2 = 0;
        while (i2 < n9Var.f255) {
            int i3 = i2;
            i2 = i3 + 1;
            IntentFilter intentFilter = (IntentFilter) n9Var.f254[i3];
            if (mo522(str3, intentFilter) && (iM2 = a.m2(p9Var.f276, p9Var.f277, (iMo7 = mo7(intentFilter)))) < 0 && (!z || intentFilter.hasCategory("android.intent.category.DEFAULT"))) {
                int iMatch = intentFilter.match(action, str, str2, data, set, null);
                if (iMatch >= 0 && (objMo6 = mo6(intentFilter, iMatch, i)) != null) {
                    arrayList.add(objMo6);
                    int i4 = p9Var.f277;
                    int[] iArr = p9Var.f276;
                    int i5 = iM2 ^ (-1);
                    int i6 = i4 + 1;
                    if (i6 <= iArr.length) {
                        System.arraycopy(iArr, i5, iArr, i5 + 1, i4 - i5);
                        iArr[i5] = iMo7;
                    } else {
                        int[] iArr2 = new int[(i4 | 1) << 1];
                        System.arraycopy(iArr, 0, iArr2, 0, i5);
                        iArr2[i5] = iMo7;
                        System.arraycopy(iArr, i5, iArr2, i5 + 1, iArr.length - i5);
                        iArr = iArr2;
                    }
                    p9Var.f276 = iArr;
                    p9Var.f277 = i6;
                }
            }
        }
    }
}
