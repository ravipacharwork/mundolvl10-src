/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.accounts.IAccountAuthenticator
 *  android.accounts.IAccountAuthenticatorResponse
 *  android.accounts.IAccountManagerResponse
 *  android.os.Bundle
 */
package top.bienvenido.date_24323;

import android.accounts.Account;
import android.accounts.IAccountAuthenticator;
import android.accounts.IAccountAuthenticatorResponse;
import android.accounts.IAccountManagerResponse;
import android.os.Bundle;
import top.bienvenido.date_24323.c9;

public final class d3
extends c9 {
    public final /* synthetic */ Account \u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
    public final /* synthetic */ Bundle \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;

    public d3(boolean bl, Account account, Bundle bundle, IAccountManagerResponse iAccountManagerResponse, String string, String string2) {
        this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b = account;
        this.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6 = bundle;
        super(iAccountManagerResponse, string, bl, true, string2, true, true);
    }

    @Override
    public final void \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6() {
        IAccountAuthenticator iAccountAuthenticator = this.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c;
        if (iAccountAuthenticator != null) {
            IAccountAuthenticator iAccountAuthenticator2 = iAccountAuthenticator;
            d3 d32 = this;
            iAccountAuthenticator = d32.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
            Bundle bundle = d32.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;
            iAccountAuthenticator2.confirmCredentials((IAccountAuthenticatorResponse)this, (Account)iAccountAuthenticator, bundle);
            return;
        }
    }
}

