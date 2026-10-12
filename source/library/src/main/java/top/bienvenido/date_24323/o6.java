package top.bienvenido.date_24323;

import android.nfc.NfcAdapter;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/o6.class */
public final class o6 extends AbstractC0057 {

    /* JADX INFO: renamed from: 要不要把你妈卵子扣出来给你做寿司吃, reason: contains not printable characters */
    public static final o6 f263 = new o6();

    @Override // top.bienvenido.date_24323.AbstractC0057
    /* JADX INFO: renamed from: 狂犬疫苗忘了给你妈打不好意思让它到处咬人才会生出你这种上缺脑子下缺逼火葬场都不收的烂骨灰 */
    public final void mo10() {
        u2 s2Var;
        r2 r2Var;
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(b3.f17);
        if (defaultAdapter == null) {
            return;
        }
        try {
            Field declaredField = NfcAdapter.class.getDeclaredField("sService");
            declaredField.setAccessible(true);
            if ((declaredField.getModifiers() & 8) == 0 && !declaredField.getType().isPrimitive()) {
                s2Var = new s2(ca.f51.objectFieldOffset(declaredField));
            } else {
                s2Var = r2Var;
                r2Var = new r2(declaredField);
            }
        } catch (Exception unused) {
            s2Var = u2.f337;
        }
        Object objMo393 = s2Var.mo393(defaultAdapter);
        if (objMo393 == null) {
            return;
        }
        this.f485 = u4.f341;
        d1 d1VarM657 = m657("nfc", objMo393);
        if (d1VarM657 == null) {
            return;
        }
        s2Var.mo394((Object) null, d1VarM657.f57);
    }
}
