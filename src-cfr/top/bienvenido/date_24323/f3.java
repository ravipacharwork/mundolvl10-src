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
import top.bienvenido.date_24323.e3;

public final class f3
extends c9 {
    public final /* synthetic */ IAccountManagerResponse \u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b;
    public final /* synthetic */ Account \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;

    public f3(IAccountManagerResponse iAccountManagerResponse, Account account, String string, String string2) {
        this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b = iAccountManagerResponse;
        this.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6 = account;
        super(iAccountManagerResponse, string, false, false, string2, false, false);
    }

    @Override
    public final void \u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6() {
        IAccountAuthenticator iAccountAuthenticator = this.\u867d\u7136\u4e0d\u662f\u540c\u4e00\u65f6\u95f4\u4f46\u662f\u662f\u540c\u4e00\u4e2a\u4f60\u5988\u4f60\u7239\u6211\u518d\u6b21\u6311\u6218\u4e00\u628a\u5403\u9634\u7b2c;
        if (iAccountAuthenticator != null) {
            iAccountAuthenticator.getAccountCredentialsForCloning((IAccountAuthenticatorResponse)this, this.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6);
            return;
        }
    }

    @Override
    public final void onResult(Bundle bundle) {
        if (bundle != null && bundle.getBoolean("booleanResult", false)) {
            Account account = this.\u6211\u7a7a\u964d\u4f60\u7239\u846c\u793c\u7528\u4f60\u5988\u5b50\u5bab\u5f39\u594f\u4e00\u66f2dj\u7248\u6c42\u4f5b\u4e3a\u4f60\u7239\u4ea1\u7075\u8d85\u5ea6;
            String string = account.type;
            String string2 = account.name;
            new e3(this.\u7528\u6405\u62cc\u673a\u628a\u4f60\u5988\u7684\u9634\u6269\u4e00\u4e0b, account, bundle, string, string2).\u8001\u5b50\u5b9e\u5728\u770b\u4e0d\u8fc7\u4f60\u5988\u7684\u8111\u6b8b\u72d7\u903c\u6837\u5b50\u76f4\u63a5\u628a\u4f60\u5988\u75285\u6bdb\u94b1\u5356\u5230\u57c3\u585e\u4fc4\u6bd4\u4e9a\u56fd\u5bb6\u5927\u5993\u9662\u8bf7\u90a3\u4e9b\u975e\u6d32\u90e8\u843d\u5c0f\u55bd\u5570\u6765\u4eab\u53d7\u4f60\u5988\u903c\u7684\u9ed1\u9634\u903c();
            return;
        }
        super.onResult(bundle);
    }
}

