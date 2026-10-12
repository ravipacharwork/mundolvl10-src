package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/w9.class */
public final class w9 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final Account f389;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final String[] f390dj;

    public w9(IAccountManagerResponse iAccountManagerResponse, Account account, String[] strArr) {
        super(iAccountManagerResponse, account.type, false, true, account.name, false, false);
        this.f389 = account;
        this.f390dj = strArr;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        try {
            IAccountAuthenticator iAccountAuthenticator = this.f49;
            if (iAccountAuthenticator != null) {
                iAccountAuthenticator.hasFeatures(this, this.f389, this.f390dj);
            }
        } catch (Exception unused) {
            onError(1, "remote exception");
        }
    }

    @Override // top.bienvenido.date_24323.c9, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        IAccountManagerResponse iAccountManagerResponseM111 = m111();
        if (iAccountManagerResponseM111 != null) {
            try {
                if (bundle == null) {
                    iAccountManagerResponseM111.onError(5, "null bundle");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBoolean("booleanResult", bundle.getBoolean("booleanResult", false));
                iAccountManagerResponseM111.onResult(bundle2);
            } catch (Exception unused) {
            }
        }
    }
}
