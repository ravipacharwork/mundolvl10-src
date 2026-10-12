package top.bienvenido.date_24323;

import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/j3.class */
public final class j3 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final /* synthetic */ String f181;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(String str, String str2, IAccountManagerResponse iAccountManagerResponse) {
        super(iAccountManagerResponse, str, false, false, null, false, false);
        this.f181 = str2;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f49;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAuthTokenLabel(this, this.f181);
        }
    }

    @Override // top.bienvenido.date_24323.c9, top.bienvenido.mundo.common.ext.MundoAccountSession
    public final void onResult(Bundle bundle) {
        if (bundle == null) {
            super.onResult(bundle);
            return;
        }
        String string = bundle.getString("authTokenLabelKey");
        Bundle bundle2 = new Bundle();
        bundle2.putString("authTokenLabelKey", string);
        super.onResult(bundle2);
    }
}
