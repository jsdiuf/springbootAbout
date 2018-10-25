package com.jsdiuf.designPatten.decorator;

/**
 * @author weicc
 * @create 2018-10-08 10:52
 **/
public class Program {


    //Component（抽象构件）
    interface ProgramMonkey {
        void skills();
    }

    //ConcreteComponent（具体构件）
    class AndroidProgramMonkey implements ProgramMonkey {
        @Override
        public void skills() {
            System.out.println("会写Android代码！");
        }
    }

    //ConcreteComponent（具体构件）
    class PHPProgramMonkey implements ProgramMonkey {
        @Override
        public void skills() {
            System.out.println("会写PHP代码！");
        }
    }

    //Decorator（抽象装饰类）
    class ProgramMonkeyDecorator implements ProgramMonkey {
        protected ProgramMonkey mProgramMonkey;

        public ProgramMonkeyDecorator(ProgramMonkey mProgramMonkey) {
            this.mProgramMonkey = mProgramMonkey;
        }

        @Override
        public void skills() {
            mProgramMonkey.skills();
        }
    }

    //ConcreteDecorator（具体装饰类）
    class PatternDecorator extends ProgramMonkeyDecorator {
        public PatternDecorator(ProgramMonkey mProgramMonkey) {
            super(mProgramMonkey);
        }

        @Override
        public void skills() {
            super.skills();
            System.out.println("会设计模式！");
        }
    }


    public void  main(String[] args) {
        //有一个Android程序猿只会写Android代码
        Program.ProgramMonkey programMonkey = new Program.AndroidProgramMonkey();
        programMonkey.skills();
        //装饰一下他，装逼的技能，他竟然除了写Android还懂设计模式
        programMonkey = new Program.PatternDecorator(programMonkey);
        programMonkey.skills();

        programMonkey = new Program.PHPProgramMonkey();
        programMonkey.skills();
    }
}