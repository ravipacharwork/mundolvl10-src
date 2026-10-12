package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-f2ae229f7a1aaaead6edd0cf03efc49ca83326987c451251376a78a6dd420e49 */
/* JADX INFO: loaded from: classes.jar:top/bienvenido/date_24323/d3.class */
public final class d3 extends c9 {

    /* JADX INFO: renamed from: 用搅拌机把你妈的阴扩一下, reason: contains not printable characters */
    public final /* synthetic */ Account f58;

    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度, reason: contains not printable characters */
    public final /* synthetic */ Bundle f59dj;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(boolean z, Account account, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String str, String str2) {
        super(iAccountManagerResponse, str, z, true, str2, true, true);
        this.f58 = account;
        this.f59dj = bundle;
    }

    @Override // top.bienvenido.date_24323.c9
    /* JADX INFO: renamed from: 我空降你爹葬礼用你妈子宫弹奏一曲dj版求佛为你爹亡灵超度 */
    public final void mo101dj() {
        IAccountAuthenticator iAccountAuthenticator = this.f49;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.confirmCredentials(this, this.f58, this.f59dj);
        }
    }
}
